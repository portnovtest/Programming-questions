package com.dataStructuresAndAlgorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(1000000);
        int search = 999999;
        boolean isFound = false;
        for (int i = 0; i < data.getSize(); i++) {
            data.numberOfTries++;
            if (data.data[i]==search){
                System.out.println("Element is found after " + data.numberOfTries + " tries");
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("number is not found!!!");
        }
    }
}
