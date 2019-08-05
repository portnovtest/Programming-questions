package com.string.questions;

public class ReverseEachWordDemo {
    public static void main(String[] args) {
        String str = "How are you";
        // Expected output: "woh era uoy"
        String result = "";

        String[] arr = str.split("\\s");

        for (String word : arr) {
            // write logic to reverse a string
            String reverseWord = "";
            int j = word.length()-1;
            while (j>=0){
                char ch = word.charAt(j);
                reverseWord += ch;
                j--;
            }
            result += (reverseWord + " ");
        }
        System.out.println(result);
    }
}
