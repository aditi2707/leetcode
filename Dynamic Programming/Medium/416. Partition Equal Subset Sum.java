class Solution {

    public boolean findSubset(int[] nums, int i, int target, int[][] dp){

        if(target == 0){
            return true;
        }
        if(i == 0){
            return target == nums[0];
        }

        if(dp[i][target] != -1){
            return dp[i][target] == 1;
        }

        boolean result = false;
        if(target >= nums[i]){
            result = findSubset(nums, i - 1, target - nums[i], dp) || 
            findSubset(nums, i - 1, target, dp);
        }
        else{
            result = findSubset(nums, i - 1, target, dp);
        }

        dp[i][target] = result? 1 : 0;

        return result;
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(Integer i: nums){
            sum += i;
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum / 2;

        boolean[] prev = new boolean[target + 1];
        prev[0] = true;

        for(int i = 1; i <= target; i++){
            prev[i] = false;
        }

        for(int i = 1; i <= nums.length; i++){
            boolean[] curr = new boolean[target + 1];
            curr[0] = true;
            for(int j = 1; j <= target; j++){
                boolean result = false;
                if(j >= nums[i - 1]){
                    result = prev[j - nums[i - 1]] || prev[j];
                }
                else{
                    result = prev[j];
                }

                curr[j] = result;
            }
            prev = curr;
        }

        return prev[target];






        // int sum = 0;
        // for(Integer i: nums){
        //     sum += i;
        // }

        // if(sum % 2 != 0){
        //     return false;
        // }

        // int target = sum / 2;

        // boolean[][] dp = new boolean[nums.length + 1][target + 1];

        // for(int i = 0; i <= nums.length; i++){
        //     dp[i][0] = true;
        // }
        // for(int i = 1; i <= target; i++){
        //     dp[0][i] = false;
        // }

        // for(int i = 1; i <= nums.length; i++){
        //     for(int j = 1; j <= target; j++){
        //         boolean result = false;
        //         if(j >= nums[i - 1]){
        //             result = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
        //         }
        //         else{
        //             result = dp[i - 1][j];
        //         }

        //         dp[i][j] = result;
        //     }
        // }

        // return dp[nums.length][target];





        
        // int sum = 0;
        // for(Integer i: nums){
        //     sum += i;
        // }

        // if(sum % 2 != 0){
        //     return false;
        // }

        // int[][] dp = new int[nums.length][(sum / 2) + 1];

        // for(int i = 0; i < nums.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return findSubset(nums, nums.length - 1, sum / 2, dp);
    }
}
