package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.print("Enter a  number  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Prime factors of " + n + " : ");
        primeFactorization(n);
    }

    /*
    primeFactorization function takes an argument n integer and go through each value until square root of n
    @params : an integer to get prime factorization

    time complexity : O(sqrt(n);
    space complexity : O(1);
     */
    public static void primeFactorization(int n){
        while(n%2 == 0){
            System.out.print("2 ");
            n /= 2;
        }
        for(int i=3;i<=Math.sqrt(n); i += 2){
            while(n%i == 0){
                System.out.print("" + i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.println(""+ n);

    }
}
