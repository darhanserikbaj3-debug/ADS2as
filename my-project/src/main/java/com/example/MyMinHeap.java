package com.example;

public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list;

    public MyMinHeap() {
        list = new MyArrayList<>();
    }

    public void insert(T item) {
        list.add(item);
        traverseUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) return null;
        T min = list.get(0);
        T lastItem = list.get(list.size() - 1);
        
        if (list.size() > 1) {
            list.set(0, lastItem);
            list.remove(list.size() - 1);
            traverseDown(0);
        } else {
            list.remove(0);
        }
        return min;
    }

    private void traverseUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else break;
        }
    }

    private void traverseDown(int index) {
        while (true) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < list.size() && list.get(leftChild).compareTo(list.get(smallest)) < 0) {
                smallest = leftChild;
            }
            if (rightChild < list.size() && list.get(rightChild).compareTo(list.get(smallest)) < 0) {
                smallest = rightChild;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public boolean isEmpty() { return list.size() == 0; }
    public int size() { return list.size(); }
}