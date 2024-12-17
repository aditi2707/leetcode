class Solution {

    public int jumpGame(int[] nums, int i, int[] dp){

        if(i >= nums.length - 1){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int jump = 1000000000;
        for(int j = 1; j <= nums[i] && j < nums.length; j++){
            jump = Math.min(jump, 1 + jumpGame(nums, i + j, dp));
        }

        dp[i] = jump;
        return dp[i];
    }


    public int jump(int[] nums) {

        int[] dp = new int[nums.length];
        dp[dp.length - 1] = 0;

        for(int i = nums.length - 2; i >= 0; i--){
            int jump = 1000000000;
            for(int j = 1; j <= nums[i] && j < nums.length; j++){
                if(i + j < nums.length){
                    jump = Math.min(jump, 1 + dp[i + j]);
                }
            }
            dp[i] = jump;
        }

        return dp[0];






        
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp, -1);

        // return jumpGame(nums, 0, dp);
    }
}
