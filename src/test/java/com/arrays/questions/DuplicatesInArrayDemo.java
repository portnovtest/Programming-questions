package com.arrays.questions;

import java.util.*;

public class DuplicatesInArrayDemo {
    public static void main(String[] args) {
        int[] inputArray = {2,5,6,7,6,11,8,2,9,11,7};
        // Bruit force method
        findDuplicateUsingBruteForce(inputArray);
        // Sorting
        findDuplicatesUsingSorting(inputArray);
        // HashSet
        findDuplicatesUsingHashSet(inputArray);
        // HashMap
        findDuplicatesUsingHashMap(inputArray);
    }

    private static void findDuplicateUsingBruteForce(int[] arr){
        // time complexity : o(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element found : " + arr[i]);
                }
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] arr){
        // time complexity : o(n)+o(nlogn)
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]==arr[i+1]){
                System.out.println("Duplicate element found : " + arr[i]);
            }
        }
    }

    private static void findDuplicatesUsingHashSet(int[] arr){
        // time complexity : o(n)
        Set<Integer> hs = new HashSet<>();
        for (int x : arr) {
            if (!hs.add(x)){
                System.out.println("Duplicate element found : " + x);
            }
        }
    }

    private static void findDuplicatesUsingHashMap(int[] arr){
        // time complexity : o(n)
        Map<Integer,Integer> hm = new HashMap<>();
        for (int x : arr) {
            if (!hm.containsKey(x)){
                hm.put(x, 1);
            } else {
                hm.put(x, hm.get(x) + 1);
            }
        }
        for (Integer x : hm.keySet()) {
            if (hm.get(x) > 1){
                System.out.println("Duplicate element found : " + x);
            }
        }
    }

}
