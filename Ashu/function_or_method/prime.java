package com.Ashu.function_or_method;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt();
        check(num);
    }
    static void check(int a){
        for (int i = 2; i < a; i++) {
            if (a%i == 0) {
                System.out.println(a+" is not prime");
                break;
            }
            if (i==a-1) System.out.println(a+" is Prime");
        }
        if (a==2) System.out.println("Prime");
    }
}
