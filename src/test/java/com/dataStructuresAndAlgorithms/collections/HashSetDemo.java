package com.dataStructuresAndAlgorithms.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
    //    HashSet<String> ls = new HashSet<>(); // unordered
        TreeSet<String> ls = new TreeSet<>();
        ls.add("Hussein");
        ls.add("Jena");
        ls.add("Laya");
        ls.add("Laya");
        Iterator<String> itr = ls.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

