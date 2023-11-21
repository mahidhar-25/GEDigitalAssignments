package com.bridgelabz.BasicProblems;

/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter number to check palindrome: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int flag = 0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.println("" + n + " is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag != 1 ){
            System.out.println("" + n + " is a prime number");
        }

    }
}
