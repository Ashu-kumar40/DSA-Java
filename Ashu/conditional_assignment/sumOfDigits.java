package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int dig = in.nextInt();
        int sum = 0;
        while (dig>0){
            int rem = dig%10;
            sum +=rem;
            dig/=10;
        }
        System.out.println("The sum of the digit is = "+sum);
    }
}
