class Solution {

    public int maxMoney(int[] nums, int m, int[] dp){

        if(m >= nums.length){
            return 0;
        }

        if(dp[m] != -1){
            return dp[m];
        }

        dp[m] = Math.max(nums[m] + maxMoney(nums, m+2, dp), maxMoney(nums, m+1, dp));

        return dp[m];
    }

    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
    
        return maxMoney(nums, 0, dp);
    }
}
