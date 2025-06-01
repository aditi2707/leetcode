class Solution {
    public int[] leftRightDifference(int[] nums) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1) (if we ignore the output array)
        

        int left = 0, right = 0;
        int[] ans = new int[nums.length];

        for(Integer i: nums){
            left += i;
        }

        ans[nums.length - 1] = left - nums[nums.length - 1];
        left -= nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            right += nums[i + 1];
            left -= nums[i];
            ans[i] = Math.abs(left - right);
        }

        return ans;





        
        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)


        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];

        // for(int i = 1; i < nums.length; i++){
        //     left[i] = left[i - 1] + nums[i - 1];
        // }
        // for(int i = nums.length - 2; i >= 0; i--){
        //     right[i] = right[i + 1] + nums[i + 1];
        //     left[i] = Math.abs(left[i] - right[i]);
        // }

        // return left;
    }
}
