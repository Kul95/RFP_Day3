package com.Practice.ArraysProblems;

public class PrintDuplicateElement {
    public static void main(String[] args) {
        int arr[]={1,2,2,5,4,6,5,7,8,7};
        System.out.println("Duplicate array elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(" "+arr[i]);
                }
            }
        }
    }
}
