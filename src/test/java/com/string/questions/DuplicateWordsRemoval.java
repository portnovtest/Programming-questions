package com.string.questions;

import java.util.*;

public class DuplicateWordsRemoval {
    public static void main(String[] args) {
        // input = "I am am rahul rahul";
        // expected output = "I am rahul";
        String input = "I am am rahul rahul";
        String[] inputArray = input.split("\\s");
        Set<String> mySet = new LinkedHashSet<>();
        for (String x : inputArray) {
            mySet.add(x);
        }
        Iterator itr = mySet.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // alternative solution
//        mySet.addAll(Arrays.asList(inputArray));
//        for (String s : mySet) {
//            System.out.print(s + " ");
//        }
    }


}
