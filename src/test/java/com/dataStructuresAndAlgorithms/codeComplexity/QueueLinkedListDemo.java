package com.dataStructuresAndAlgorithms.codeComplexity;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        QueueLinkedList<String> q = new QueueLinkedList<>();
        q.queue("Jena");
        q.queue("Layla");
        q.queue("Hussein");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
