package com.bridgelabz.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        System.out.print("Enter two strings with space : ");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String p = input.next();
        int length1 = n.length() , length2 = p.length();
        if(length1 != length2){
            System.out.println(n + " , " + p + " are not anagrams");
            return;
        }
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        Arrays.fill(count1 , 0);
        Arrays.fill(count2 , 0);
        for(int i=0;i<length1;i++){
            count1[n.charAt(i)]++;
            count2[p.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(count1[i] != count2[i]){
                System.out.println(n + " , " + p + " are not anagrams");
                return;
            }
        }
        System.out.println(n + " , " + p + " are  anagrams");

    }
}
