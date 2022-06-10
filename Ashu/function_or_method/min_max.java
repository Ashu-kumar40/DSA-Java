package com.Ashu.function_or_method;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        minmax(a,b,c);
    }
    static void minmax(int n1, int n2, int n3){
        int min = Math.min(n1, Math.min(n2,n3));
        int max = Math.max(n1, Math.max(n2,n3));
        System.out.println("The minimum value is = "+min);
        System.out.println("The maximum value is = "+max);
    }

}
