package com.dataStructuresAndAlgorithms.treeTherory;

import java.util.HashSet;

public class TreesCompare {
    public static void main(String[] args) {
        new TreesCompare().run();
    }
    void run(){
        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.add(tree1.root, tree1.nodeCreate(10));
        tree1.add(tree1.root, tree1.nodeCreate(12));
        tree1.add(tree1.root, tree1.nodeCreate(11));
        scanTree(tree1.root,true);

        BinarySearchTree tree2 = new BinarySearchTree();

        tree2.add(tree2.root, tree2.nodeCreate(11));
        tree2.add(tree2.root, tree2.nodeCreate(10));
        tree2.add(tree2.root, tree2.nodeCreate(12));
        scanTree(tree2.root,false);

        if (tree1.size != tree2.size || !isEqual){
            System.out.println("trees are not equal");
        } else {
            System.out.println("trees are equal");
        }
    }

    HashSet<Integer> set = new HashSet<>();

    boolean isEqual = true;
    void scanTree(Node node, boolean isSaved){
        if (node==null){
            return;
        }
        // called by tree 1
        if (isSaved){
            set.add(node.value);
        } else {
            // called by tree 2
            if (!set.contains(node.value)){
                isEqual = false;
                System.out.println("Trees are not equal");
            }
        }
        scanTree(node.left, isSaved);
        scanTree(node.right, isSaved);
    }
}
