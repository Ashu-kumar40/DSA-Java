package com.Ashu.searching;

import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {23, 4, 5, 6, 7, 32, 54, 6, 3};
        int target = 32;
        int start = 1, end = 4;
        int result = linearSearch(nums, target, start,end);
        System.out.println(result);
    }
    static int linearSearch(int[] arr, int target , int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
}
