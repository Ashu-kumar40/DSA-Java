package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class vowel_consonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char alpha = in.next().charAt(0);
        switch (alpha) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonants");
                break;
        }
    }
}
