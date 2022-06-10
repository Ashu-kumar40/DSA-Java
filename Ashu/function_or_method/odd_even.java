package com.Ashu.function_or_method;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        oddeven(num);
    }
    static void oddeven(int a){
        if (a%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
