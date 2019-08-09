package com.string.questions;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String str = "I am learning learning java java java programming";
        Map<String,Integer> map = new HashMap<>();
        Integer count = 1;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (String x : map.keySet()) {
            System.out.println(String.format("The count of word : %s = %d", x, map.get(x)));
        }
    }
}
