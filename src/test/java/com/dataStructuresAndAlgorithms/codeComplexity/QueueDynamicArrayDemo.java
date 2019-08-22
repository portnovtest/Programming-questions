package com.dataStructuresAndAlgorithms.codeComplexity;

public class QueueDynamicArrayDemo {
    public static void main(String[] args) {
        QueueDynamicArray<Integer> q = new QueueDynamicArray<>(2);
        q.queue(11);
        q.queue(12);
        System.out.println("Size:" + q.getSize());
        q.queue(12);
        System.out.println("Size:" + q.getSize());
    }
}
