package com.Ashu.function_or_method;

import java.util.Scanner;

public class natural_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Till which number you want to sum of natural numbers:");
        int num = in.nextInt();
        int add = nat_sum(num);
        System.out.println("Summation is: "+add);
    }
    static int nat_sum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum +=i;
        }
        return sum;
    }
}
