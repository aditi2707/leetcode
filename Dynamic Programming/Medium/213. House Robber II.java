class Solution {

    public int findMaxMoney(int[] nums, int m, int n, int[] dp){

        if(m > n){
            return 0;
        }

        if(dp[m] != -1){
            return dp[m];
        }

        dp[m] = Math.max(nums[m] + findMaxMoney(nums, m+2, n, dp), findMaxMoney(nums, m+1, n, dp));
        return dp[m];
    }

    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(findMaxMoney(nums, 0, nums.length - 2, dp1), findMaxMoney(nums, 1, nums.length - 1, dp2));
    }
}
