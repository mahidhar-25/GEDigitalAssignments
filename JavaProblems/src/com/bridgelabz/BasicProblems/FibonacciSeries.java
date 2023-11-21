package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter number of elements need to print in fibonacci series: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=1,b=1;
        if(n==1)
            System.out.print("1");
        else if (n>1)
          System.out.print("1 , 1");
        if(n>2){
            for(int i=2;i<n;i++){
                int sum = a+b;
                a = b;
                b = sum;
                System.out.print(", " + sum );
            }
        }
    }


}
