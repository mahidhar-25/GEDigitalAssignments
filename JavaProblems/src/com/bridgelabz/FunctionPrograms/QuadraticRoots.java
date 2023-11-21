package com.bridgelabz.FunctionPrograms;
import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args) {
        System.out.print("enter a , b, c co-efficients  of a equation : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta = Math.sqrt(b * b - 4 * a * c);
        double x = (-b + delta) /2*a*1d;
        double y = (-b - delta) /2*a*1d;
        System.out.println("Quadratic roots of the equation " + a + "x^2 + "+ b + "x + " + c + " : " + (x + " , " +  y));

    }
}
