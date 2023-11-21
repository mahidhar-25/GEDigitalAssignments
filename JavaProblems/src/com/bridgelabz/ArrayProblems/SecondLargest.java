package com.bridgelabz.ArrayProblems;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        int ans = Integer.MIN_VALUE;
        int temp = ans;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            if(arr[i] >= ans){
                temp = ans;
                ans = arr[i];

            }else if(temp < arr[i] && ans > temp){
                temp = arr[i];
            }
        }
        System.out.println( (ans != Integer.MIN_VALUE ? "Second Max value is "+ temp : "there is no max value" ));
    }
}
