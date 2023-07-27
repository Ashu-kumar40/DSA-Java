// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        // This problem can be solved by two methods. first is bruteforce approch
        // and the second is by two pointer method.

        // bruteForce(nums);
        System.out.println(Arrays.toString(twoPointers(nums)));
    }

    static void bruteForce(int[] nums){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                // copying non zero elements in temp array
                temp.add(nums[i]);
            }
        }

        int nz = temp.size();
        for(int i  = 0; i < nz; i++){
            //storing non zero elements in original array
            nums[i] = temp.get(i);
        }

        for(int i = nz; i < nums.length; i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    static int[] twoPointers(int[] nums){
        int j = -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if( j == -1) return nums;

        for(int i = j+1; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}
