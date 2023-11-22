package com.bridgelabz.AlgorithmProblems;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        bubbleSort(arr , n);
        System.out.println("Bubble sort : ");
        printArray(arr , n);
    }

    public static void bubbleSort(int[] arr , int n){
        int i, j;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j]= arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] arr , int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
