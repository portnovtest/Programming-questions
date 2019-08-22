package com.dataStructuresAndAlgorithms.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Hussein");
        ls.add("Jena");
        ls.add("Laya");
        Iterator<String> itr = ls.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
