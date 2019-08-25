package com.dataStructuresAndAlgorithms.sort;

public class MergeSort {
    int[] array;
    int[] tempArray;

    public static void main(String[] args) {
        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        new MergeSort().prepareForSort(arr);
        System.out.println("\nAfter Sort");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }

    void prepareForSort(int[] arr){
        // prepare for sort
        this.array = arr;
        this.tempArray = new int[arr.length];
        doMergeSort(0, arr.length-1);
    }

    void doMergeSort(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex)/2;
            doMergeSort(lowerIndex, middle); // ex. (1-5)
            doMergeSort(middle + 1, higherIndex); // ex. (6,10)
            mergePart(lowerIndex,middle,higherIndex);
        }
    }
    // merge small problems and sort
    void mergePart(int lowerIndex,int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex ; i++)
            tempArray[i] = array[i];
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex){
                if (tempArray[i] <= tempArray[j]){
                    array[k] = tempArray[i];
                    i++;
                } else {
                    array[k] = tempArray[j];
                    j++;
                }
                k++;
            }
        while (i <= middle){
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
