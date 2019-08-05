package com.string.questions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    //How to find duplicate characters on a String
    public static void main(String[] args) {
        String str = "programming";

        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int count = 1;

        for (char c : arr) {
            if (!map.containsKey(c)) {
                map.put(c, count);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        // printing duplicates

        for (Character key : map.keySet()) {
            if (map.get(key) > 1){
                System.out.println(key + " : " + map.get(key));
            }
        }
    }
}
