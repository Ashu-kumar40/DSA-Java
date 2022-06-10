package com.Ashu.searching;

public class mountainArray {
    public static void main(String[] args) {
        int[] marr = {1,2,3,9,10,14,15,18,23,25,26,29,13,11,8,1};
        int start = 0;
        int end = marr.length-1;
        int peak = peak(marr, start, end);
        System.out.println("The peak of the mountain is : " + peak);

    }

    static int peak(int[] marr, int start, int end){
        while(start < end){
            int mid = start + (end - start)/2;
            if (marr[mid] > marr[mid + 1]) {
                end = mid;
            } else if (marr[mid] < marr[mid + 1]) {
                start = mid+1;
            }
        }
        return marr[end];
    }
}
