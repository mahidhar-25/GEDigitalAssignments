package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.Scanner;
public class LeapYear {
/*
* takes the input integer , and check whether number has exactly 4 digits or not.
* if not it takes input again , it continues till we get number length is 4
* Once we get year , we check whether it is a leap year or not.
*/
    public static void main(String[] args) {
        boolean lengthOfNumber = false;
        int n=0;
        while(!lengthOfNumber){
            System.out.print("Enter a 4 digit number : ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            lengthOfNumber = (getTheLengthOfNumber(n) == 4 );
            if(!lengthOfNumber){
                System.out.println("Please Enter a valid 4 digit number");
            }
        }
        System.out.println("" + n + " is " + (checkLeapYear(n) ? "" : " not") + " a leap year!!");
    }
/*
* getTheLengthOfNumber takes the number as an argument and return the length of the number / digits in a number.
*
* @params : number is taken to calculate no of digits in a number
* @return : integer number is returned
*
    time complexity : O(1);
    space complexity : O(1);
*
*/
    public static int getTheLengthOfNumber(int number){
        int length = 0;
        while(number > 0){
            number /= 10;
            length++;
        }
        return length;
    }

/*
* checkLeapYear takes the year in integer as an input and check whether it is leap year or not
* @params : year(integer)
* @return : checks whether year is Leap year ot not and return boolean value
*
    time complexity : O(1);
    space complexity : O(1);
*/
    public static boolean checkLeapYear(int year){
        return (year % 400) == 0 || (year % 100) != 0 && (year % 4 == 0);

    }
}
