class Solution {
    public int maxScore(int[] nums) {

        // int max = 0, ans = 0;

        // for(int i = nums.length-1; i > 0; i--){
        //     max = Math.max(max, nums[i]);
        //     ans += max;
        // }

        // return ans;
        
        int[] dp = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                dp[i] = Math.max(dp[i], dp[j]+(i-j)*nums[i]);
            }
        }

        return dp[nums.length-1];
    }
}
