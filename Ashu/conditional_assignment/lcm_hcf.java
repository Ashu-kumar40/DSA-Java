package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class lcm_hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1 = ");
        int n1 = in.nextInt();
        System.out.print("Enter the number 2 = ");
        int n2 = in.nextInt();
        int var1 = 1,var2 = 2;
        while (var1 > 0) {
            if (var1 % n1==0 && var1%n2==0) {
                System.out.println("The LCM is = "+var1);
                break;
            }
            var1++;
        }
        while (var2 <= n2 && var2 <= n1) {
            if (n1%var2==0 && n2%var2==0){
                System.out.println("The HCF is = "+var2);
                break;
            }
            var2++;
        }
        if (n1%var2 != 0 && n2%var2 != 0){
            System.out.println("The HCF is = 1");
        }
    }
}
