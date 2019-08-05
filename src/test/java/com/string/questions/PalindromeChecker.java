package com.string.questions;
// using recursion

// logic for solving problem

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "nitin";
        boolean result = isPalindrome(str);
        System.out.println(str + " IsPalindrome = " + result);
    }

    private static boolean isPalindrome(String str) {

        if (str==null){
            return false;
        }
        if (str.length()<=1){
            return true;
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        if (!first.equals(last)){
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length()-1));
        }
    }
}
