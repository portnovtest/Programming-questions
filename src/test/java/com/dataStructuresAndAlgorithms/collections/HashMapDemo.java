package com.dataStructuresAndAlgorithms.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hussein");
        map.put(4, "Jena");
        map.put(555, "Laya");
        System.out.println(map.get(1));
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("key:" + m.getKey() + ", value:" + m.getValue());
        }
        map.put(1,"Hussein Alrubaye");
        System.out.println(map.get(1));
        map.remove(1);
    }
}
