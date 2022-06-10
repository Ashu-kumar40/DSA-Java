package com.Ashu.searching;

public class oddCells {
    public static void main(String[] args) {
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int m = 2,n =3;
        int result = oddCells(m,n,indices);
        System.out.println(result);
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix =  new int [m][n];
        for (int r = 0; r< indices.length; r++){
            for(int c = 0; c<indices[r].length; c++){
               int num = indices[r][c];
                for (int i = num; i <= num; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j]++;
                    }
                }for (int i = 0; i < matrix.length; i++) {
                    for (int j = num; j <= num; j++) {
                        matrix[i][j]++;
                    }
                }
             }
        }
        int count = 0;
        for (int[] p : matrix) {
            for (int q : p) {
                System.out.print(q + " ");
//                if(matrix[i][j]%2 != 0) count++;
            }
            System.out.println();
        }
        return count;
    }
}
