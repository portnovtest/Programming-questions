package com.arrays.questions;

import java.util.Arrays;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5,6,7,8,10};

        // Find the sum of all numbers
        //51
        //55
        // subtract actual from expected and you will get a missing number

        int sum = 0;
        int expectedSum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum+=numArray[i];
        }
        for (int i = 1; i <= 10; i++){
            expectedSum += i;
        }

        System.out.println(Arrays.toString(numArray));
        System.out.println(String.format("The missing number is %d",expectedSum - sum));
    }
}
