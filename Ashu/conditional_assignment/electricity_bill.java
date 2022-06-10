package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total power of appliance (in watt): ");
        int p = in.nextInt();
        System.out.print("Total time appliances used (in hour): ");
        int t = in.nextInt();
        System.out.print("No. of days: ");
        int d = in.nextInt();
        float unit = p/1000f*t*d;
        System.out.println("Total amount is = "+(unit*8+356));

    }
}
