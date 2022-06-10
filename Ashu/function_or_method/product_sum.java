package com.Ashu.function_or_method;

import java.util.Scanner;

public class product_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = summation(num1,num2);
        int mul = product(num1,num2);
        System.out.println("The addition of these numbers is = "+sum);
        System.out.println("The product of these numbers is = "+mul);

    }
    static int summation(int a, int b){
        return a+b;
    }
    static int product(int x, int y){
        return x*y;
    }
}
