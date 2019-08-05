package com.string.questions;

/**
 * how to reverse words in a sentence in Java
 */
public class ReverseWordsDemo {
    public static void main(String[] args) {
        String str = "We are learning java";
        String result = "";

        // Expected output: "java learning are We"

        String[] arr = str.split("\\s"); // or " "

        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }
        System.out.println(result);
    }
}
