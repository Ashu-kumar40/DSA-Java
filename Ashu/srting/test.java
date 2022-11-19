package com.Ashu.srting;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
//        String s = "codeleet";
//        String newStr = new String();
//        for (int i : indices) {
//            System.out.println(s);
//            int strIndex = indices[i];
////            newStr.charAt(strIndex) = s.charAt(i);
//        }


        System.out.println("Enter the nth number you want to return");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = findNth(n);
        System.out.println(p);
    }
    static int findNth(int n){

        if(n < 2){
            return n;
        }
        else if (n % 5 == 0){
            return 11;
        }
        else{
            return findNth(n-1) + findNth(n-2);
        }
    }
}
