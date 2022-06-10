package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int fac=1 , i=1;
        while (i<=num){
            fac = fac*i;
            i++;
        }
        System.out.println("The factorial is = "+fac);
    }
}
