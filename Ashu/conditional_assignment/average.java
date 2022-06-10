// Calculate the average of N numbers

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int sum = 0, num = in.nextInt();
        for (int i = 1; i<=num; i++) sum += i;
        float avg = (float) sum/num;
        System.out.println("The average is = "+avg);


    }
}
