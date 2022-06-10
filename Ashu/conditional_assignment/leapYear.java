package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        if (year%4 == 0) {
            System.out.println("Year is leap");
        }else{
            System.out.println("Year is not leap");
        }
    }
}
