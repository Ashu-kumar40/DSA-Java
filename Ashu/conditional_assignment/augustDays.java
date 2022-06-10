/* Kunal is allowed to go out with his friends only on the even days of a given month.
 Write a program to count the number of days he can go out in the month of August.*/

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class augustDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int aug = 31,sum = 0;
        for (int i = 1; i <= aug; i++) {
            if (i%2==0){
                sum++;
            }
        }
        System.out.println("Kunal can go out "+sum+" days in the month of August");
    }
}
