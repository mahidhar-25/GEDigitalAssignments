package com.bridgelabz.ArrayProblems;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            if(arr[i] >= ans){
                ans = arr[i];
            }
        }
        System.out.println( (ans != Integer.MIN_VALUE ? "Max value is "+ ans : "there is no max value" ));
    }
}
