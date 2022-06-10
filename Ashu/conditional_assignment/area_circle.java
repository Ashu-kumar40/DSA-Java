// Write a java program to find the area and parameter of the circle.

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        int r = in.nextInt();
        String  inp = in.nextLine();
        float pi = 3.141f;
        float area = pi*r*r;
        float para = 2*pi*r;
        System.out.println("The area of the circle is = " +area);
        System.out.println("The parameter of the circle is = " +para);
    }
}
