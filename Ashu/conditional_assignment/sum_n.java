package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class sum_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt(), sum = 0;
        for (int i= 1; i <= num; i++) {
            sum +=i;
        }
        System.out.println("The summation of first "+num+ " natural numbers is = "+sum);
    }
}
