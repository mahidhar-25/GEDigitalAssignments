package com.bridgelabz.AlgorithmProblems;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        selectionSort(arr , n);
        System.out.println("selection sort : ");
        printArray(arr , n);
    }

    public static void selectionSort(int[] arr , int n){
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr , int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
