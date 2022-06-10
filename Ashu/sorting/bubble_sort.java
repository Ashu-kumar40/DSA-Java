package com.Ashu.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,-3,2,6,-9,7,8,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the loop n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each value of i the max item come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous one
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){ // !swapped(false) == true
                break; // break the loop if the elements will not swap for the particular value of .
                        // (because the array will be sorted)
                        // you don't need to check for the next i's
            }
        }
    }
}
