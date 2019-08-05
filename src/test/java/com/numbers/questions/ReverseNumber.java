package com.numbers.questions;

public class ReverseNumber {

    // input: 1234
    // expected output: 4321
    public static int reverseNumber(int num){
        int result = 0;
        while (num > 0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(123456));
    }
}
