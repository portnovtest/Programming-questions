package com.dataStructuresAndAlgorithms.search;

public class InterpolationSearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(999999);
        int search = 1;
        boolean isFound = false;
        int low = 0;
        int high = data.getSize() - 1;
        int mid = 0;
        while (true){
            if (low > high){
                System.out.println("Number is not found!!!");
                // break;
            }
            mid = low + ((high - low)/(data.data[high] - data.data[low])) * (search - data.data[low]);
            data.numberOfTries++;
            if (data.data[mid]==search){
                System.out.println("number is found after " + data.numberOfTries + " tries");
                break;
            }
            if (data.data[mid] < search)
                low += mid;
            if (data.data[mid] > search)
                high -= mid;
        }
    }
}
