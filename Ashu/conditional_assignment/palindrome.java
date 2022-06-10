package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt();
        int temp = num,sum = 0;
        while (num > 0) {
            int r = num%10;
            sum = sum*10 +r;
            num /=10;
        }
        System.out.println(sum);
        if (sum == temp){
            System.out.println("This number is palindrome");
        } else{
            System.out.println("This number is not palindrome");
        }
    }
}
