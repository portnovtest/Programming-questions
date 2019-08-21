package com.dataStructuresAndAlgorithms.codeComplexity;

public class StackDynamicArrayDemo {
    public static void main(String[] args) {
        StackDynamicArray<Integer> st = new StackDynamicArray<>(2);
        st.push(12);
        st.push(12);
        System.out.println("Size stack: " + st.getSize());
        st.push(12);
        System.out.println("Size stack: " + st.getSize());
    }
}
