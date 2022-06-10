package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class ncr_npr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = in.nextInt();
        System.out.print("Enter r = ");
        int r = in.nextInt();
        int fact_n = factorial(n);
        System.out.println("n! = "+fact_n);
        int fact_r = factorial(r);
        System.out.println("r! = "+fact_r);
        int fact_nr = factorial(n-r);
        System.out.println("(n-r)! = "+fact_nr);
        float npr = (float) fact_n/fact_nr;
        float ncr = (float) fact_n/(fact_r*fact_nr);
        System.out.println("nPr = "+npr);
        System.out.println("nCr = "+ncr);

    }
    static int factorial(int num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
