package com.Ashu.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Shifting_of_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String ele = in.nextLine();
            String[] arr = ele.split(" ");
//            System.out.println(arr[0]);
            for(int j = (n - (k%n)); j < n; j++){
                System.out.print(arr[j] + " ");
            }
            for(int m = 0; m < (n - (k%n)); m++){
                System.out.print(arr[m] + " ");
            }
//            System.out.println(Arrays.toString(arr));
        }
//        String[] arr = in.nextLine().split(" ");

    }
}
