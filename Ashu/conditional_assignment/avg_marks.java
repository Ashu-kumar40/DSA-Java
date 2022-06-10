package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class avg_marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many subject you have: ");
        int sub = in.nextInt();
        int obt, total_obt = 0;
        for (int i = 1; i<=sub; i++){
            System.out.print("Obtained marks sub"+i+": ");
            obt = in.nextInt();
            total_obt += obt;
        }
        float avg = total_obt/sub;
        System.out.println("Average marks = "+avg);
    }
}
