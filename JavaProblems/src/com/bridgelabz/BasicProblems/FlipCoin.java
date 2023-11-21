package com.bridgelabz.BasicProblems;
/*
importing useful modules
Scanner : to take inputs from the console
Random : to generate rand values
*/
import java.util.Scanner;
import java.util.Random;


public class FlipCoin {
    public static void main(String[] args) {
        // Taking the input n , such that how many times should we toss
        System.out.print("Enter no of times you wanted to toss the coin : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //Initializing the tail counter with double because while calculating probability we need decimal values
        double tailCounter = 0.0;
        double randValue;
        //looping n times and generating rand values
        for(int i=0;i<n;i++){
        Random rand = new Random();
         randValue =  (rand.nextInt() * 1d)/ Integer.MAX_VALUE;
         if(randValue > 0.5)tailCounter++;
        }

        double trailPercentage = (tailCounter)/(n *1d);
        double headPercentage = 1d - trailPercentage;
        System.out.printf("Probability of getting tail over %d tosses: %.6f%n", n, trailPercentage);
        System.out.printf("Probability of getting head over %d tosses: %.6f%n", n, headPercentage);
    }
}

/*

    time complexity : O(n);
    space complexity : O(1);
 */