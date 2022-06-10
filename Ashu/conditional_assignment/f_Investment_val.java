package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class f_Investment_val {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        int dep = in.nextInt();
        System.out.print("Enter the percentage interest: ");
        float per = in.nextFloat();
        System.out.print("Enter the time period (in year): ");
        int t = in.nextInt();
        float fiv = (float) (dep*Math.pow(1+per/100, t));
        System.out.println("The future investment value is = "+fiv);
    }
}
