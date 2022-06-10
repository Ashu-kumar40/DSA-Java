package com.Ashu.searching;

public class Kth_missing_element {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 11, 12, 15, 17};
        int s = 0;
        int e = arr.length-1;
        int k = 15;

        int missNum = binary_search(arr, s, e, k );
        System.out.println(missNum);
    }
    static int binary_search(int[] arr, int s, int e, int Kth){
        while(s<=e){
            int m = s + (e-s)/2;
            int missN = arr[m] - (m+1);
            if(missN <= Kth){
                s = m + 1;
            }
            else{
                e = m-1;
            }
        }
        System.out.println(s);
        return arr[s-1]-1;
    }
}
