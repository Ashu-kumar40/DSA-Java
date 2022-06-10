package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the digit = ");
        int dig = in.nextInt();
        int n = 1,sum = 0;
        System.out.print("Factors is/are: ");
        while (n<dig){
            if (dig%n == 0) {
                System.out.print(n+", ");
                sum = sum+n;
            }
            n++;
        }
        if (sum == dig) {
            System.out.println("\nThe number is Perfect");
        }
    }
}
