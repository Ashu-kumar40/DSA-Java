//distance between the two points

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("y1 = ");
        int y1 = in.nextInt();
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("y2 = ");
        int y2 = in.nextInt();
        float dis = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.print("The Distance between two points is = "+dis);

        
    }
}
