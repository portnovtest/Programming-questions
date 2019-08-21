package com.dataStructuresAndAlgorithms.codeComplexity;

public class StackLinkedListDemo {
    public static void main(String[] args) {
        StackLinkedList<String> st = new StackLinkedList<>();
        st.pop();
        st.push("Hussein");
        st.push("Jena");

        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
