package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal Amount = ");
        float Pamt = in.nextFloat();
        System.out.print("Enter the percentage rate per month = ");
        float rate = in.nextFloat();
        System.out.print("Time period (in months)= ");
        int t = in.nextInt();


//        first method ie. without using formula
//        float newPamt = Pamt;
//        for (int i = 0; i<t; i++){
//            newPamt = newPamt + newPamt*rate/100;
//        }
//        System.out.println("The compound interest is = "+(newPamt - Pamt));
//
//
//        second method using formula
        float ci = (float) (Pamt*Math.pow((1 + rate/100), t) - Pamt);
        System.out.println("The compound interest is = "+ci);
    }
}
