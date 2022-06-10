package com.Ashu.searching;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9,12,13,16,18,23,26};
        int target = 5;
        int s = 0;
        int e = arr.length - 1;

        int search = binary_search( arr, s, e, target);
        System.out.println(search);
    }
     static int binary_search(int[] arr, int s, int e, int target){
        while(s<=e){
            int m = s + (e-s)/2;
            if (arr[m] == target) {
                return m;
            }
            else if(arr[m] < target){
                s = m + 1;
            }
            else{
                e = m;
            }
        }
        return -1;
     }
}
