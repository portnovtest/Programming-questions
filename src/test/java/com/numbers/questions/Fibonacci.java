package com.numbers.questions;

public class Fibonacci {
    public static void main(String[] args) {
        // Expected output: 0 1 1 2 3 5 8 13 21

        int first = 0;
        int second = 1;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int third = first + second;
            first=second;
            second=third;
        }
    }
}
