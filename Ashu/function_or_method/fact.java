package com.Ashu.function_or_method;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        factorial(num);
    }
    static void factorial(int a){
        int mul = 1;
        for (int i = 1; i <= a; i++) {
            mul = mul*i;
        }
        System.out.println("The factorial of given number is: "+mul);
    }
}
