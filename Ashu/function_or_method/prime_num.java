package com.Ashu.function_or_method;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("From: ");
        int from = in.nextInt();
        System.out.print("To: ");
        int to = in.nextInt();
        prime(from,to);
    }
    static void prime(int a, int b){
        int i,j;
        for (i = a; i <= b; i++) {
            for (j = 2; j < i; j++) {
                if (i%j==0) break;
                if (j==i-1) System.out.print(i+", ");
            }
        }
    }
}
