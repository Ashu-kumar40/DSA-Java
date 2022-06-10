package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the last number = ");
        int num  = in.nextInt();
        int a = 0, b = 1,i = 2;
        while (i <= num) {
            int n = b;
            System.out.print(a+", ");
            b += a;
            a = n;
            i++;
        }
    }
}
