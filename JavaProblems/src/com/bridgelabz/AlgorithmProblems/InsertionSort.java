package com.bridgelabz.AlgorithmProblems;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        insertionSort(arr , n);
        System.out.println("insertion sort : ");
        printArray(arr , n);
    }

    public static void insertionSort(int[] arr , int n){
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr , int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
