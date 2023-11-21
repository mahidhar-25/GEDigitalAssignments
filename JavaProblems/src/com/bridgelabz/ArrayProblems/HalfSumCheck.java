package com.bridgelabz.ArrayProblems;

import java.util.Scanner;

public class HalfSumCheck {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        int sum1=0 , sum2=0;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            if((i+1)>n/2){
                sum1 += arr[i];
            }else{
                sum2 += arr[i];
            }
        }
        if(sum1 == sum2){
            System.out.println("Sum of both half arrays are equal , sum is : " + sum1);
        } else{
            System.out.println("Sum of both half arrays are not equal , they are " + sum1 + " , "+ sum2);
        }
    }
}
