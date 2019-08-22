package com.dataStructuresAndAlgorithms.collections;

import com.dataStructuresAndAlgorithms.codeComplexity.Student;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("basic queue");
        Queue<Integer> q = new LinkedList<>();
        q.add(13);
        q.add(12);
        q.add(14);
        q.add(15);
        System.out.println(q.poll());

        System.out.println("priority queue");
        PriorityQueue<Integer> qp = new PriorityQueue<>();
        qp.add(13);
        qp.add(12);
        qp.add(14);
        qp.add(15);
        System.out.println(qp.poll());
        System.out.println(qp.poll());

        System.out.println("priority queue for students");
        PriorityQueue<Student> pStudents = new PriorityQueue<>();
        pStudents.add(new Student("Hussein", 27));
        pStudents.add(new Student("Jena", 2));
        pStudents.add(new Student("Laya", 1));
        System.out.println(pStudents.poll().name);

    }
}
