package com.Ashu.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        ArrayList<Integer> arr = new ArrayList<>();
        int[][] mat = new int[matrix.length][];
//        for(int row=0; row<matrix.length; row++){
//            for(int col = 0; col<matrix[row].length; col++){
//                mat[row][col] = matrix[col][row];
//            }
//        }
        System.out.println(mat[0][2]);
//        for (int[] ints : mat) {
//            for (int anInt : ints) {
//                System.out.println(anInt);
//            }
//            System.out.println();
//        }
    }

}
