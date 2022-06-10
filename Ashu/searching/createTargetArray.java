package com.Ashu.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class createTargetArray {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,3,4};
//        int[] target = new int[index.length];
//        for (int i = 0; i < index.length; i++) {
//            target[index[i]] = nums[i];
//        }
        ArrayList<Integer> ele = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            ele.add(i,in.nextInt());
        }
        // if we want output as an array then we use ArrayList
        System.out.println(ele);
        // we can add elements in between the array, all the elements after this will be shifted after adding
        ele.add(2,33);
        System.out.println(ele);
    }
}
