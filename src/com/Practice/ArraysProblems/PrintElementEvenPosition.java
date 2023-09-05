package com.Practice.ArraysProblems;

public class PrintElementEvenPosition {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,6,7,8,9};
        System.out.println("Even array elements:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
