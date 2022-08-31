package com.Ashu.Recursion;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        System.out.println("Enter the nth number you want to return");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = fib(n);
        System.out.println(p);
    }
    static int fib(int n){
        if(n < 2){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}
