class Solution {

    public boolean jumpGame(int[] nums, int i, int[] dp){

        if(i == nums.length - 1){
            return true;
        }

        if(dp[i] != -1){
            return dp[i] == 1? true : false;
        }

        boolean jump = false;
        for(int j = 1; j <= nums[i] && j < nums.length; j++){
            jump = jump || jumpGame(nums, i + j, dp);
            if(jump){
                dp[j] = 1;
                return true;
            }
        }

        dp[i] = 0;
        return jump;
    }

    public boolean canJump(int[] nums) {

        int lastPos = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] + i >= lastPos){
                lastPos = i;
            }
        }

        return lastPos == 0;









        // int[] dp = new int[nums.length];
        
        // dp[nums.length - 1] = 1;

        // for(int i = nums.length - 2; i >= 0; i--){
        //     int jump = 0;
        //     for(int j = 1; j <= nums[i]; j++){
        //         if(i + j < nums.length){
        //             jump = jump | dp[i + j];
        //         }
        //     }
        //     dp[i] = jump;
        // }

        // return dp[0] == 1? true : false;





        
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp, -1);

        // return jumpGame(nums, 0, dp);
    }
}
