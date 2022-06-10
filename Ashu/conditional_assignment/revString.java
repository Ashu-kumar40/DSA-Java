package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("write something: ");
        String name = in.next();
        for (int i = name.length() - 1; i >= 0; i--) {
            char revStr = name.charAt(i);
            System.out.print(revStr);

        }
    }
}
