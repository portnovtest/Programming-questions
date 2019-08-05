package com.numbers.questions;

public class FactorialRecursion {

    private static int findFactorial(int n){
        if (n <= 1){
            return 1;
        } else {
            return n * findFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(String.format("The factorial of %d is %d",n,findFactorial(n)));
    }
}
