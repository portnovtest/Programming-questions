package com.dataStructuresAndAlgorithms.graphTheory;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    int size;
    AdjacencyList[] array;

    public BFSGraph(int size) {
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
    public void bfsExplore(int startVertex){
        Boolean[] visited  = new Boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        while (!q.isEmpty()){
            int n = q.poll();
            System.out.println("Visited node: " + n);
            visited[n] = true;
            Node head = array[n].head;
            while (head != null){
                if (!visited[head.value]){
                    q.add(head.value);
                    visited[head.value] = true;
                } else {
                    head = head.next;
                }
            }
        }
    }
}
