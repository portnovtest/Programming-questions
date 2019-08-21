package com.dataStructuresAndAlgorithms.codeComplexity;

public class QueueArrayDemo {
    public static void main(String[] args) {
        QueueArray<Integer> q = new QueueArray<>(5);
        q.queue(5);
        q.queue(2);
        q.queue(3);
        q.queue(6);
        q.queue(8);
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

    }
}
