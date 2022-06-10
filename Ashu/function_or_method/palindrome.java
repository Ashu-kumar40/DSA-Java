package com.Ashu.function_or_method;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = in.nextInt();
        pal(num);

    }
    static void pal(int a){
        int i = a,sum = 0;
        while (i>0){
            int r = i%10;
            sum = sum * 10 +r;
            i/=10;
        }
        if (sum == a) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
