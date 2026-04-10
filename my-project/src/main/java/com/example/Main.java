package com.example;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        System.out.println("+++ MyArrayList +++");
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList.get(0));
        System.out.println("ArrayList: " + arrayList.size());

        //MyLinkedList
        System.out.println("\n+++ MyLinkedList +++");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        System.out.println("LinkedList: " + linkedList.get(1));

        //MyStack
        System.out.println("\n+++ MyStack +++");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        System.out.println("Stack: " + stack.pop()); 

        //MyQueue
        System.out.println("\n+++ MyQueue +++");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        System.out.println("Queue: " + queue.dequeue());

        //MyMinHeap
        System.out.println("\n+++ MyMinHeap +++");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(50);
        heap.insert(10);
        heap.insert(30);
        System.out.println("MinHeap (min element): " + heap.extractMin());
    }
}