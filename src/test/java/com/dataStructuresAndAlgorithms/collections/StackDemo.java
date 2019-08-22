package com.dataStructuresAndAlgorithms.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Admins");
        st.push("Manager");
        st.push("Tester");

        System.out.println(st.pop());
    }
}
