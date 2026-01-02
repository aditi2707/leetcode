class Solution {
    public int repeatedNTimes(int[] nums) {

        // Edge case:
        // 1. If n = 2 and the repeated element is at the extreme positions.
        

        // Time Complexity : O(n)

        // Space Complexity : O(1)


        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i];
            }
            else if(nums[i + 1] == nums[i + 2]){
                return nums[i + 1];
            }
            else if(nums[i] == nums[i + 2]){
                return nums[i];
            }
        }

        return nums[0];
    }
}
