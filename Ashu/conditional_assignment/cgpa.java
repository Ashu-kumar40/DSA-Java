package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total marks obtained = ");
        int obt = in.nextInt();
        System.out.print("Max marks = ");
        int mm = in.nextInt();
        float cgpa = (float) (obt * 10) / mm;
        System.out.println("CGPA = "+cgpa);

    }
}
