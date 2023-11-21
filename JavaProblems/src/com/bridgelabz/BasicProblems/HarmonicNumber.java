package com.bridgelabz.BasicProblems;

/*
importing useful modules
Scanner : to take inputs from the console
*/

import java.util.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.print("Enter a  number  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numerator=1 , denominator=1;
        for(int i=1;i<n;i++){
            numerator = (i+1)*numerator + denominator;
            denominator = (i+1) * denominator;
        }
        int commonFactor = highestCommonFactor(numerator , denominator);
        System.out.println("The "+ n + " Harmonic Number is " + numerator/commonFactor + "/" + denominator/commonFactor);
    }
/*
calculate the highest common factor of two integers by recursively calling
@params : two integers a and b
@return : return the integer with highest common factor;

    time complexity : O(log(min(a , b));
    space complexity : O(1);
 */
    public static int highestCommonFactor(int a , int b){
        return (b==0) ? a : highestCommonFactor(b , a%b);
    }


}
