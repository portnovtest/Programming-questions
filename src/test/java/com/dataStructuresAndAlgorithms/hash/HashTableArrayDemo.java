package com.dataStructuresAndAlgorithms.hash;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray<String> hm = new HashTableArray<>(10);
        hm.put(11, "hussein");
        hm.put(12, "jena");
        hm.put(13, "laya");
        System.out.println(hm.get(13));
    }
}
