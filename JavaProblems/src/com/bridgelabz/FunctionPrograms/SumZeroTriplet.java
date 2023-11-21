package com.bridgelabz.FunctionPrograms;
/*
importing useful modules
Scanner : to take inputs from the console
Hashset : for storing the results in a better way
*/

import java.util.HashSet;
import java.util.Scanner;
public class SumZeroTriplet {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
     /*
     Brute Force
    Time complexity : O(n3);
    space Complexity : O(n);
     */
        int counter = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        if(counter == 0){
                            System.out.print("The Triplets are : ");
                        }
                    System.out.print("( " + arr[i] + "," + arr[j] + "," + arr[k] + ") , ");
                    counter++;
                    }
                }
            }
        }
           System.out.println("Total no of Triplets are : " + counter);

        System.out.println("Triplet using Hashmap : ");
         FindTriplets(arr , n);
    }

    /*
    FindTriplets function find all possible triplets which sums to zero by optimizing the loop in n2 complexity using hashmaps
    @params : integer array one dimensional
    @params : n , size of the array

    Time complexity : O(n2);
    space Complexity : O(1);
     */
    public static void FindTriplets(int[] arr , int n) {

        boolean isTripletFound = false;

        for(int i=0;i<n-1;i++){
            var mp = new HashSet<Integer>();
            for(int j=i+1;j<n;j++){
                int x = -(arr[i]+arr[j]);
               if(mp.contains(x)){
                   if(!isTripletFound){
                       System.out.print("The Triplets are : ");
                   }
                   System.out.print("(" + x + "," + arr[i] + "," + arr[j] + ") , ");
                   isTripletFound = true;
               }else{
                   mp.add(arr[j]);
               }

            }
        }

        if(!isTripletFound){
            System.out.println("No Triplets found");
        }
    }
}
