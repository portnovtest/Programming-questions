package com.dataStructuresAndAlgorithms.codeComplexity;

public class LinkedListyUDemo {
    public static void main(String[] args) {
        LinkedListU<String> ls = new LinkedListU<>();
        ls.add("Hussein");
        ls.add("Jena");
        ls.add("Layla");
        ls.add("Waeel");
        System.out.println("Before delete");
        ls.display();
        System.out.println("After delete");
        ls.delete();
        ls.display();
    }
}
