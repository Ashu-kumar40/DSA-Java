package com.Ashu.searching;

public class search_inserted {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,12,34,67};
        int target = 11;
        int s = 0;
        int e = nums.length - 1;
        int result = search(nums, s, e, target);
        System.out.println(result);
    }
    static int search(int[] nums, int s, int e, int target){
        while ( s <= e){
            int m = s + (e-s) /2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] < target) {
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return s;
    }
}
