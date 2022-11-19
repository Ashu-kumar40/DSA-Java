//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true


package com.Ashu.sorting.questions;

import java.util.Arrays;
import java.util.Collection;

public class Contains_duplicates {
    public static void main(String[] args) {
        int[] arr = {6,2,1,5,6,3};
        System.out.println(Check_duplicates(arr));
    }

    static boolean Check_duplicates(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int indicator = 0;
        for(int i = 1; i < nums.length; i++){
            if ( nums[i] == nums[indicator]){
                return true;
            }
            indicator++;
        }
        return false;
    }
}
