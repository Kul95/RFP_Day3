package com.Practice.ArraysProblems;

public class PrintSmallestElement {
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 1, 3, 2, 7, 4, 9};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is:" + min);
    }
}
