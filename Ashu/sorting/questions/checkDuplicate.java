package com.Ashu.sorting.questions;

import java.util.Arrays;

public class checkDuplicate {
    public static void main(String[] args) {
        int[] nums = {-1,5,-1,2,0,3,4};
        check(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(check(nums));
    }
    static  boolean check(int[] nums) {
//        // sort the given array
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1 ; j >0 ; j--) {
//                if (nums[j] < nums[j-1]){
//                    swap(nums, j, j-1);
//                }
//                else {
//                    break;
//                }
//            }
//        }
//
//        // Now check for the duplicate number
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

        if (nums.length == 0) return false;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
