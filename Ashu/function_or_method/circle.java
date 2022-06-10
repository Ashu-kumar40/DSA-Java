package com.Ashu.function_or_method;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float rad = in.nextFloat();
        area(rad);
    }
    static void area(float a){
        float A = (float) (3.14*a*a);
        float cir = (float) (2*3.14*a);
        System.out.println("The area of the circle is = "+A);
        System.out.println("The circumference of the circle is = "+cir);
    }
}
