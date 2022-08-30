package com.Ashu.Pattern_questions;

// Step to solve any pattern questions
// 1. Outer loop will run no. of times = no. of rows/lines available.
// 2. Identify for every row number, how many columns are there?
// 3. Identify what do I need to print.
// 4. Try to find out the formula relating to rows and columns.

public class pattern {
    public static void main(String[] args) {
        pattern_15(5);
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

//   11. Print the following pattern
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
    
    static void pattern_11(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//   12. Print the following pattern
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
    
    static void pattern_12(int n){
        for (int row = 0; row < 2*n; row++) {
            if (row < n) {
                for (int space = 0; space < row ; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < n - row; star++) {
                    System.out.print("* ");
                }
            }
            else{
                for (int space = 0; space < 2*n - row - 1; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star <row - n + 1; star++) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }

//13.         *
//           * *
//          *   *
//         *     *
//        *********

    static void pattern_13(int n){
        for (int row = 1; row <= n; row++) {
            if(row == n){
                for (int star = 1; star < 2*n; star++) {
                    System.out.print("*");
                }
            }
            else{
                for (int space = 0; space < n-row; space++) {
                    System.out.print(" ");

                }
                for (int colSt = 1; colSt < 2*row; colSt++) {
                    if (colSt == 1 || colSt == 2*row-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }




//14.     *********
//         *     *
//          *   *
//           * *
//            *
    static  void pattern_14(int n){
        for (int row = n; row >= 1; row--) {
            if (row == n) {
                for (int star = 2*n; star > 1 ; star--) {
                    System.out.print("*");
                }
            }
            else{
                for (int space = 0; space < n - row; space++) {
                    System.out.print(" ");
                }
                for (int colSt = 2*row ; colSt > 1; colSt--) {
                    if (colSt == 2*row || colSt == 2) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


//15.         *
//           * *
//          *   *
//         *     *
//        *       *
//         *     *
//          *   *
//           * *
//            *

    static void pattern_15(int n){
        for (int row = 1; row < 2*n; row++) {
            int outerSpace = row < n ? n - row : row - n;
            for (int space = 0; space < outerSpace; space++) {
                System.out.print(" ");
            }
            if (row == 1 || row == 2*n - 1){
                System.out.print("*");
            }
            else {
                int loop = 0;
                loop = row <= n ? 2 * row - 1 : loop - 2;
                for (int patt = 1; patt < loop; patt++) {
                    if (patt == 1 || patt == loop - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int patt = loop; patt >= 1; patt-=2) {
                    if (patt == 1 || patt == loop) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


//16.             1
//              1   1
//            1   2   1
//          1   3   3   1
//        1   4   6   4   1
//
//
//17.        1
//          212
//         32123
//        4321234
//         32123
//          212
//           1
//
//
//18.     **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//
//19.     *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//20.     ****
//        *  *
//        *  *
//        *  *
//        ****
//21.     1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15


//22.     1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1


//23.         *      *
//          *   *  *   *
//        *      *      *


//24.     *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *


//25.         *****
//           *   *
//          *   *
//         *   *
//        *****


//        26.
//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6


//        27.
//        1 2 3 4  17 18 19 20
//          5 6 7  14 15 16
//            8 9  12 13
//              10 11


//        28.
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *


//        29.
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


//        30.
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5



//        31.
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4


//32.
//    E
//    D E
//    C D E
//    B C D E
//    A B C D E


//33.
//    a
//    B c
//    D e F
//    g H i J
//    k L m N o



//34.
//    E D C B A
//    D C B A
//    C B A
//    B A
//    A



//35.
//        1      1
//        12    21
//        123  321
//        12344321

}
