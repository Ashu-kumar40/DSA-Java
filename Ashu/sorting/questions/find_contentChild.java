package com.Ashu.sorting.questions;

import java.util.Arrays;

public class find_contentChild {
    public static void main(String[] args) {
        int[] g = {1,1,2,3};
        int[] s = {1,1};
        sort(g);
        System.out.println(Arrays.toString(g));
        sort(s);
        System.out.println(Arrays.toString(s));
        if(s[s.length-1] >= g[g.length-1]){
            System.out.println(g[g.length-1]);
        }

        System.out.println(s.length);

    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // This loop will run n-2 times (n: size of the array)
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1); // elements will swap if any element is smaller than the previous one
                }
                else{
                    break; // Loop will break if there is no swap occur.
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
