package com.Ashu.Array;

public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {437,315,78,322,431,686,264,78,442};
        int dig, count=0;
        for (int ele :
                nums) {
            dig=0;
            while (ele > 0){
                int rem = ele%10;
                dig++;
                ele/=10;
            }
            if (dig%2==0) count++;
        }
        System.out.println(count);
    }
}
