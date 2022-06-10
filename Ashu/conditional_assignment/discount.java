// Calculate the discount of the product.

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount of the product: ");
        float amt = in.nextFloat();
        System.out.print("% Discount: ");
        int per = in.nextInt();
        float dis = amt - amt*per/100;
        System.out.println("Discount: "+(amt*per/100));
        System.out.print("The amount of the product after discount = "+dis);
    }
}
