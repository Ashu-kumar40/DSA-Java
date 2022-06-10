package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the limit = ");
        int num = in.nextInt();
        int n=0,sum = 0, dig = num;
        // for number of digit
        while (dig>0){
            n++;
            dig /= 10;
        }
        int temp = num;
        while (temp>0){
            int r = temp%10;
            sum = (int) (sum + Math.pow(r, n));
            temp /=10;
        }
        System.out.println("Sum = "+sum);
        if(sum == num){
            System.out.println("This is an armstrong number");
        }else {
            System.out.println("This is not an armstrong number");
        }
        for (int i = 1; i<=num; i++){

        }
    }
}
