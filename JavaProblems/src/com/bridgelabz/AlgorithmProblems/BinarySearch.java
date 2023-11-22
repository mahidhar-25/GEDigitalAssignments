package com.bridgelabz.AlgorithmProblems;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = input.nextInt();
        binarySearch(arr , n , target);
    }

    public static void binarySearch(int[] arr , int n , int target) {
        int l = 0, r = n-1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) {
                System.out.println("we found the " + target + " at position " + m);
                return;
            }
            if (arr[m] < target)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        System.out.println("we did not found the " + target);
    }
}
