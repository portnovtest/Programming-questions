package com.arrays.questions;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;

public class LargestSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,-9,-25,234,7,0,2};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            } else if (arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(String.format("The largest element is %d and the smallers element is %d",largest,smallest));
        //System.out.println(smallest);
    }
}
