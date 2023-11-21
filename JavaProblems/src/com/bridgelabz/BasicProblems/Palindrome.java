package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter number to check palindrome: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp=n , sum=0 , r;
      while(n>0){
          r = n%10;
          sum = sum*10 + r;
          n /= 10;
      }
      if(temp == sum){
          System.out.println("Number " + temp + " is a palindrome number");
      }else{
          System.out.println("Number "+ temp + " is not a palindrome number");
      }

    }

}
