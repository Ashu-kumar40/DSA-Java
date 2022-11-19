//  https://leetcode.com/problems/squares-of-a-sorted-array/


//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

package com.Ashu.sorting.questions;

import java.util.Arrays;

public class Squares_of_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        sort(nums);
//        Arrays.sort(nums); // we can use sort library
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
                else break;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
