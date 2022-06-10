package com.Ashu.function_or_method;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        eligibility(age);

    }
    static void eligibility(int a){
        if (a>=18) System.out.println("You are eligible for voting");
        else System.out.println("You are not eligible for voting");
    }
}
