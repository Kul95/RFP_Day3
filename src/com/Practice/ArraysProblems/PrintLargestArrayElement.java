package com.Practice.ArraysProblems;

public class PrintLargestArrayElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,7,5,9,6,8};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element is: "+max);
    }
}
