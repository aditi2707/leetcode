class Solution {

    public boolean ifCanJump(int[] nums, int m, int[] dp){

        if(m >= nums.length - 1){
            return true;
        }
        
        if(nums[m] == 0 && m != nums.length - 1){
            return false;
        }

        if(dp[m] != -1){
            return dp[m] == 1? true : false;
        }

        for(int i = 1; i <= nums[m]; i++){
            if(ifCanJump(nums, m + i, dp)){
                dp[m] = 1;
                return true;
            }
        }
        
        dp[m] = 0;
        return false;
    }

    public boolean canJump(int[] nums) {

        // int i = nums.length - 1;
        // int goal = nums.length - 1;

        // while(i >= 0){
        //     if(nums[i] + i >= goal){
        //         goal = i;
        //     }
        //     i--;
        // }

        // if(goal == 0){
        //     return true;
        // }

        // return false;






        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);
        return ifCanJump(nums, 0, dp);
    }
}
