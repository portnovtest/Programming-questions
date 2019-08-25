package com.dataStructuresAndAlgorithms.sort;

public class HeapSort {
    static int total;

    public static void main(String[] args) {
        Integer[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        sort(arr);
        System.out.println("\nAfter Sort");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
    static void swap(Comparable[] arr, int a, int b){
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void heapify(Comparable[] arr, int i){
        int left = i * 2;
        int right = i * 2+1;
        int grt = i;
        if (left <= total && arr[left].compareTo(arr[grt])>=0)
            grt = left;
        if (right <= total && arr[right].compareTo(arr[grt])>=0)
            grt=right;
        if (grt!=i){
            swap(arr,i, grt);
            heapify(arr, grt);
        }
    }

    static void sort(Comparable[] arr){
        total = arr.length - 1;
        for (int i = total/2; i >= 0; i--)
            heapify(arr, i);
        for (int i = total; i > 0; i--){
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }
}
