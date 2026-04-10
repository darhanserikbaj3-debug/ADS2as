package com.example;

public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item); 
    }

    public T dequeue() {
        if (isEmpty()) return null;
        T firstItem = list.getFirst();
        list.removeFirst(); 
        return firstItem;
    }

    public T peek() {
        if (isEmpty()) return null;
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}