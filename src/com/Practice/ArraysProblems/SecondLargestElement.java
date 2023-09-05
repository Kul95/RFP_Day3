package com.Practice.ArraysProblems;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={1,3,7,5,9,3,5,6,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
