// Find the number of particular digit.

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class no_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Enter the number you want to check: ");
        int n = in.nextInt();
        int count = 0;
        while (num>0){
            int rem = num % 10;
            if (rem==n){
                count++;
            }
            num/=10;
        }
        System.out.println("This digit is " +count+ " times");
    }
}
