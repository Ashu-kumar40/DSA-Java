package com.Ashu.Array;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {23,4,5,6,7,32,54,6,3};
        int target = 32;
        int result = linearSearch(nums,target);
        System.out.println(result);
        System.out.println(linearSearch2(nums,target));
        System.out.println(linearSearch3(nums,target));
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length==0) return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
    // we can return the element as well, in this we can use enhanced for loop since we are not returning the i
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0) return -1;
        for (int element : arr) {
            if (element == target) return element;
        }
        return Integer.MAX_VALUE;
    }
    // we can return true and false
    static Boolean linearSearch3(int[] arr, int target){
        if (arr.length==0) return false;
        for (int element : arr) {
            if (element == target) return true;
        }
        return false;
    }
}
