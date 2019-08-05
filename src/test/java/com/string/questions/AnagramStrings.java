package com.string.questions;

import java.util.Arrays;

public class AnagramStrings {
    // How to check if given strings are Anagram
    public static void main(String[] args) {
        String str1 = "army";
        String str2 = "mary";

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Given strings are anagram");
        } else {
            System.out.println("Given strings are NOT anagrams");
        }

    }
}
