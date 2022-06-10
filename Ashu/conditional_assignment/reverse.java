// write a java program to reverse the digit.

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Digit: ");
        int dig = in.nextInt();
//        while (dig>0){
//            int rem = dig%10;
//            System.out.print(rem);
//            dig/=10;
//        }

        // Another method
        int sum = 0;
        while (dig>0){
            int r = dig%10;
            sum = sum*10 +r;
            dig/=10;
        }
        System.out.println(sum);

    }
}
