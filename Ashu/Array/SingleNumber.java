// Leet code question: https://leetcode.com/problems/single-number/description/

// This problem can be solved using the bitwise operator
// The XOR operator can be used to solve this

// 1^1 = 0
// 1^2^1 = 2
// 2^0 = 2

class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = nums[0];
        for(int i = 1; i < nums.length ; i++){
            singleNum = singleNum ^ nums[i];
        }
        return singleNum;
    }
}
