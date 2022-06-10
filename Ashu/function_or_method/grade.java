package com.Ashu.function_or_method;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100: ");
        int marks = in.nextInt();
        grading(marks);
    }
    static void grading(int a){
        if (a>90 && a<=100) System.out.println("AA");
        else if (a>80 && a<=90) System.out.println("AB");
        else if (a>70 && a<=80) System.out.println("BB");
        else if (a>60 && a<=70) System.out.println("BC");
        else if (a>50 && a<=60) System.out.println("CC");
        else if (a>40 && a<=50) System.out.println("CD");
        else if (a<=40) System.out.println("Fail");
    }
}
