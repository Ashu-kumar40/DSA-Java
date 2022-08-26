package com.Ashu.Pattern_questions;

// Step to solve any pattern questions
// 1. Outer loop will run no. of times = no. of rows/lines available.
// 2. Identify for every row number, how many columns are there?
// 3. Identify what do I need to print.
// 4. Try to find out the formula relating to rows and columns.

public class pattern {
    public static void main(String[] args) {
        pattern_10(6);
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
                for (int col = 1; col <= row; col++) { // this will print the rows in increment column
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int col = 0; col < n + 1 - row; col++) { // this will print the rows in decrement column
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    // 2nd method
     static void pattern_5_m2(int n){
         for (int row = 0; row < 2*n; row++) {
             int totalColInRow = row > n ? 2*n - row : row;
             for (int col = 0; col < totalColInRow; col++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }


//   6. Print the following pattern
//            *
//           **
//          ***
//         ****
//        *****
    static void pattern_6(int n){
        for (int row = 1; row <= n; row++) {
            for (int colForSpace = 0; colForSpace < n - row; colForSpace++) {
                System.out.print(" ");
            }
            for (int colForStar = 0; colForStar < row; colForStar++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//   7. Print the following pattern
//        *****
//         ****
//          ***
//           **
//            *

    static void pattern_7(int n){
        for (int row = 0; row <= n; row++) {
            for (int spaceInCol = 0; spaceInCol < row; spaceInCol++) {
                System.out.print(" ");
            }
            for (int StarInCol = 0; StarInCol <= n-row-1; StarInCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



//   8. Print the following pattern
//              *
//             ***
//            *****
//           *******
//          *********

    static void pattern_8(int n){ // n = number of column
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            int totalColInRow = row ==  1 ? row : 2*row - 1;
            for (int star = 0; star < totalColInRow; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//   9. Print the following pattern
//            *********
//             *******
//              *****
//               ***
//                *

    static void pattern_9(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(' ');
            }
            int numOfStar = 2*n - 1 - 2*row;
            for (int starInCol = 0; starInCol < numOfStar; starInCol++) {
                System.out.print("*");
//                numOfStar -= 2;
            }
            System.out.println();
        }
    }

//   10. Print the following pattern
//                     *
//                    * *
//                   * * *
//                  * * * *
//                 * * * * *
    static void pattern_10(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
