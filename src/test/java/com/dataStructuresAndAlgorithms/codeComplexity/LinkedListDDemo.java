package com.dataStructuresAndAlgorithms.codeComplexity;

public class LinkedListDDemo {
    public static void main(String[] args) {
        LinkedListD<String> ls = new LinkedListD<>();
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
