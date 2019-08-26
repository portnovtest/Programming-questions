package com.dataStructuresAndAlgorithms.treeTherory;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree(){
        root = null;
    }

    public Node nodeCreate(int value){
        return new Node(value, null, null);
    }
    int size = 0;
    public void add(Node start, Node newNode){
        if (root==null){
            root = newNode;
            return;
        }
        if (newNode.value > start.value){
            if (start.right == null){
                start.right = newNode;
                size++;
            }
            add(start.right, newNode);
        }
        if (newNode.value < start.value){
            if (start.left == null){
                start.left = newNode;
                size++;
            }
            add(start.left, newNode);
        }
    }

    public void search(int value, Node start){
        if (start == null){
            System.out.println("node is not found");
            return;
        }
        if (start.value == value){
            System.out.println("node is found");
            return;
        }
        if (value > start.value){
            search(value, start.right);
        }
        if (value < start.value){
            search(value, start.left);
        }
    }
}
