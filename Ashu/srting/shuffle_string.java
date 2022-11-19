//https://leetcode.com/problems/shuffle-string/
//You are given a string s and an integer array indices of the same length.
//The string s will be shuffled such that the character at the ith position
//moves to indices[i] in the shuffled string.
//Return the shuffled string.


package com.Ashu.srting;

public class shuffle_string {
    public static void main(String[] args) {
        String s = "raptciec"; //given string
        int[] indices = {1, 2, 0, 4, 6, 5, 7, 3}; // given array
        int length = indices.length;
        char[] array = new char[length]; // creating a new character array to store character
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int index = indices[i];
            array[index] = c;
        }
        System.out.println(new String(array));
    }
}
