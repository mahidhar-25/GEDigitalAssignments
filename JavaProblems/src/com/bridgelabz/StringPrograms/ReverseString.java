package com.bridgelabz.StringPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        StringBuilder p = new StringBuilder();
        int length = n.length();
        for(int i=0;i<length;i++){
            p.append(n.charAt(length - i - 1));
        }
        System.out.println("original string is " + n + ", Reversed string is " + p);
    }
}
