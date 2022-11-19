package com.Ashu.sorting.questions;

import java.util.Arrays;

public class Height_Checker {
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        int[] exp = new int[heights.length];
        for(int i = 0; i < exp.length; i++){
            exp[i] = heights[i];
        }
        System.out.println(check_h(exp, heights));
        System.out.println(Arrays.toString(heights));
//        System.out.println(Arrays.toString(check(heights)));
        System.out.println(Arrays.toString(exp));
    }
    static int[] sort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        return arr;
    }
    static int check_h(int[] exp, int[] hei){
        sort(exp);
        int count = 0;
        for(int i = 0; i < exp.length; i++){
            if(exp[i] == hei[i]) continue;
            else count++;
        }
        return count;
    }
}
