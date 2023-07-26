// https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void rotate(int[] nums, int k) {
    // In this question we have to left rotate the array by "k" times.
		// To do this we have to first understand that if the array has
		// n = 5 elements and the value of k is given 7 then this means we 
		// have to left rotate the array 7 times. 
		// Now think of when we rotate the array 5 times the modified array
		// will be equal to the same array as given one.
		// So, we don't need to rotate the array 7 times we need to rotate
		// the array 2 times.

		// Mathematically if the array has n elements and the number of
		// rotations is given k then we need to rotate the array k%n times.
		// In above example n = 5 and k = 7
		// Then k%n = 7%5 = 2

		int n = nums.length;
        int rot = k%n;
        int temp = nums[n-1];

        while(rot > 0){
            for(int i = n-1; i > 0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            rot--;
            temp = nums[n-1];
        }

        System.out.println(Arrays.toString(nums));
    }
}
