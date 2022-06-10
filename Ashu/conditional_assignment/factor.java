//factors of any numbers

package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                System.out.print(i+", ");
            }
        }
    }
}
