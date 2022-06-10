package com.Ashu.searching;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0,x = 0,y = mat[x].length-1;
        for(int r = 0; r< mat.length; r++){
            sum += mat[r][r];
        }

        while (x< mat.length){
            while (y>=0){
                if (x==y){
                    y--;
                    break;
                }
                sum +=mat[x][y];
                y--;
                break;
            }
            x++;
        }
        System.out.println(sum);
    }
}
