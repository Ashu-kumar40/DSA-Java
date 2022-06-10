// Find the biggest of the numbers.

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if (b>a){
//            max = b;
//        }
//        if (c>b){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
