package com.Practice.ArraysProblems;

public class OddArrayElement {
    public static void main(String[] args) {
        int arr[]={1,2,7,4,5,9,3,8,4};
        System.out.print("Odd Array elements:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
