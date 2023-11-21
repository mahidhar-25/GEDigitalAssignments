package com.bridgelabz.FunctionPrograms;
/*
importing useful modules
Scanner : to take inputs from the console
PrintWriter : to format the output
OutputStreamWriter : similar to the System.out and super class of PrintWriter
*/

import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (M): ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns (N): ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        // Reading input
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Output
        System.out.println("2D Array:");
        print2DArray(array);
    }

    /*
     Print2DArray takes an argument and print the 2d array
     @params : integer 2 dimensional array

     prints the data with the help of print writer , output stream(to format in a better way) or two write into files

        time complexity : O(n2);
    space complexity : O(1);
     */
    private static void print2DArray(int[][] array) {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out))) {
            for (int[] row : array) {
                for (int element : row) {
                    writer.print(element + " ");
                }
                writer.println();
            }
        }
    }
}


