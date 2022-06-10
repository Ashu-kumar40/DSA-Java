package com.Ashu.function_or_method;

import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pyth(a,b,c);

    }
    static void pyth(int p, int q, int r){
        int x = p*p, y = q*q, z = r*r;
        if (x+y==z){
            System.out.println(p+"x"+p+" + "+q+"x"+q+" = "+r+"x"+r);
            System.out.println(x+" + "+y+" = "+z);
            System.out.println(z+" = "+z);
            System.out.println("The number is pythagorean");
        }
        else if (x+z==y){
            System.out.println(p+"x"+p+" + "+r+"x"+r+" = "+q+"x"+q);
            System.out.println(x+" + "+z+" = "+y);
            System.out.println(y+" = "+y);
            System.out.println("The number is pythagorean");
        }
        else if (y+z==x){
            System.out.println(q+"x"+q+" + "+r+"x"+r+" = "+p+"x"+p);
            System.out.println(y+" + "+z+" = "+x);
            System.out.println(x+" = "+x);
            System.out.println("The number is pythagorean");
        }
        else System.out.println("Number is not pythagorean");
    }

}
