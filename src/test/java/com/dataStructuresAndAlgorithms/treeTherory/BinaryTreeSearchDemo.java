package com.dataStructuresAndAlgorithms.treeTherory;

public class BinaryTreeSearchDemo {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        bt.add(bt.root, bt.nodeCreate(10));
        bt.add(bt.root, bt.nodeCreate(12));
        bt.add(bt.root, bt.nodeCreate(11));
        bt.add(bt.root, bt.nodeCreate(13));
        bt.add(bt.root, bt.nodeCreate(6));
        bt.search(111, bt.root);
    }
}
