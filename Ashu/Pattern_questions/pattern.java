package com.Ashu.Pattern_questions;

// Step to solve any pattern questions
// 1. Outer loop will run no. of times = no. of rows/lines available.
// 2. Identify for every row number, how many columns are there?
// 3. Identify what do I need to print.
// 4. Try to find out the formula relating to rows and columns.

public class pattern {
    public static void main(String[] args) {
        pattern_5(9);
    }

//      1. Print the following pattern
//            *****
//            *****
//            *****
//            *****
//            *****

    static void pattern_1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) { // formula: c = r  |for each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//      2. Print the following pattern
//            *
//            **
//            ***
//            ****
//            *****
    static void pattern_2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    3. Print the following pattern
//            *****
//            ****
//            ***
//            **
//            *
    static void pattern_3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n- row; col++) {   // formula: c = n - r  |for each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//   4. Print the following pattern
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5
    static void pattern_4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


//   5. Print the following pattern
//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
    static void pattern_5(int n){
        for (int row = 1; row <= n; row++) {
            if( row <= n/2 + 1){
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int col = 0; col < n + 1 - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
