package com.bridgelabz.FunctionPrograms;
import java.util.Scanner;
public class FindDistance {
    public static void main(String[] args) {
        System.out.print("enter x and y coordinates of a point : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Euclidean distance from Origin is : " + Math.sqrt(x*x + y*y));
    }
}
