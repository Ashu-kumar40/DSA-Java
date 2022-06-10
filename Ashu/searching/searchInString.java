package com.Ashu.searching;

import java.util.Arrays;
import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        String given = in.next();

        //for making of an array of string
        System.out.println(Arrays.toString(given.toCharArray()));

        System.out.println("Input a character");
        char target = in.next().charAt(0);
        System.out.println(search(given,target));
    }
    static Boolean search(String str, char target){
        if (str.length()==0) return false;
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) return true;
//        }
        // we can use enhanced for loop
        for (char ele : str.toCharArray()){
            if (ele == target) return true;
        }
        return false;
    }
}
