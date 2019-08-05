package com.string.questions;

public class StringReverse {
    public static void main(String[] args) {
        String str = "java";

        // avaj

        // #1: Using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        String result = sb.reverse().toString();
        System.out.println(result);

        // #2 Without StringBuffer
        String result1 = "";
        for (int i = str.length() -1; i >= 0; i--) {
            result1 += str.charAt(i);
        }
        System.out.println(result1);
    }
}
