// commission percentage calculator

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write '%' for percentage calculation and 'amt' for commission amount calculation");
        String i = in.next();
//        if (i.equals("%")){
//            System.out.print("Enter the sale price (in Rs.) = ");
//            float price = in.nextFloat();
//            System.out.print("Enter the commission amount = ");
//            float com_amt = in.nextFloat();
//            float com_per = com_amt*100/price;
//            System.out.println("Commission percentage = "+com_per);
//            System.out.println("Price with commission = "+ (price+com_amt));
//            System.out.println("Price without commission = "+ (price-com_amt));
//        } else if (i.equals("amt")){
//            System.out.print("Enter the sale price (in Rs.) = ");
//            float price = in.nextFloat();
//            System.out.print("Enter the commission percentage = ");
//            float com_per = in.nextFloat();
//            float com_amt = price*com_per/100;
//            System.out.println("The commission Amount is = "+com_amt);
//            System.out.println("Price with commission = "+ (price+com_amt));
//            System.out.println("Price without commission = "+ (price-com_amt));
//        } else{
//                System.out.println("Invalid expressions");
//          }

        switch (i) {
            case "%": {
                System.out.print("Enter the sale price (in Rs.) = ");
                float price = in.nextFloat();
                System.out.print("Enter the commission amount = ");
                float com_amt = in.nextFloat();
                float com_per = com_amt * 100 / price;
                System.out.println("Commission percentage = " + com_per+ " %");
                System.out.println("Price with commission = "+ (price+com_amt));
                System.out.println("Price without commission = "+ (price-com_amt));
                break;
            }
            case "amt": {
                System.out.print("Enter the sale price (in Rs.) = ");
                float price = in.nextFloat();
                System.out.print("Enter the commission percentage = ");
                float com_per = in.nextFloat();
                float com_amt = price * com_per / 100;
                System.out.println("The commission Amount is = " + com_amt);
                System.out.println("Price with commission = "+ (price+com_amt));
                System.out.println("Price without commission = "+ (price-com_amt));
                break;
            }
            default:
                System.out.println("Invalid expression");
        }
    }
}
