package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.Scanner;
public class PowerOfTwo {

    /*
    taking an integer input and checking whether it is in range or not.
    calculating 2 power n using left shit bit manipulation

    time complexity : O(n);
    space complexity : O(1);
     */
    public static void main(String[] args) {
        boolean isNumberInRange = false;
        int n=0;
        while(!isNumberInRange){
            System.out.print("Enter a  number between 0 and 31 : ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            isNumberInRange = (n<31 && n>=0 );
            if(!isNumberInRange){
                System.out.println("Number Should be in range of [0 , 31)");
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("2 power "+i+" : " + (1<<i));
        }
    }
}
