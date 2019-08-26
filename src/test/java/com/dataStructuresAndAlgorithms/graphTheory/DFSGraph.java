package com.dataStructuresAndAlgorithms.graphTheory;

import java.util.Stack;

public class DFSGraph {
    int size;
    AdjacencyList[] array;

    public DFSGraph(int size) {
        this.size = size;
        array = new AdjacencyList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new AdjacencyList();
            array[i].head = null;
        }
    }

    // add node
    public void add(int src, int dest){
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }
    public void dfsExplore(int startVertex){
        Boolean[] visited  = new Boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        Stack<Integer> st = new Stack<>();
        st.push(startVertex);
        while (!st.isEmpty()){
            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node head = array[n].head;
            boolean isDone = true;
            while (head != null){
                if (!visited[head.value]){
                    st.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            if (isDone){
                int out = st.pop();
                System.out.println("Visited node: " + out);
            }
        }
    }
}
