class Solution {

    public int maxJumps(int[] nums, int i, int target, int[] dp){

        if(i >= nums.length - 1){
            return 0;
        }

        if(dp[i] != -10){
            return dp[i];
        }

        int maxJump = 0;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[j] - nums[i] >= -target && nums[j] - nums[i] <= target){
                maxJump = Math.max(maxJump, 1 + maxJumps(nums, j, target, dp));
            }
        }

        dp[i] = maxJump == 0? -1 : maxJump;
        return dp[i];
    }

    public int maximumJumps(int[] nums, int target) {

        int[] dp = new int[nums.length];
        dp[nums.length - 1] = 0;

        for(int i = nums.length - 2; i >= 0; i--){
            int maxJump = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] - nums[i] >= -target && nums[j] - nums[i] <= target){
                    maxJump = Math.max(maxJump, 1 + dp[j]);
                }
            }

            dp[i] = maxJump == 0? -1 : maxJump;
        }

        return dp[0];




        // int[] dp = new int[nums.length];
        // Arrays.fill(dp, -10);

        // return maxJumps(nums, 0, target, dp);
    }
}
