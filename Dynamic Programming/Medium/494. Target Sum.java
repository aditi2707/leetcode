class Solution {

    private int targetSum(int[] nums, int i, int target, int[][] dp){

        if(i == 0){
            if(target == 0 && nums[0] == 0){
                return 2;
            }
            if(target == 0 || target == nums[0]){
                return 1;
            }
            return 0;
        }

        if(target < 0){
            return 0;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int pick = targetSum(nums, i - 1, target - nums[i], dp);
        int notPick = targetSum(nums, i - 1, target, dp);

        return dp[i][target] = pick + notPick;
    }


    public int findTargetSumWays(int[] nums, int target) {

        int total = 0;

        for(Integer i: nums){
            total += i;
        }

        if((total - target) % 2 != 0 || (total - target) < 0){
            return 0;
        }

        int[] prev = new int[(total - target) / 2 + 1];

        if(nums[0] == 0){
            prev[0] = 2;
        }
        else{
            prev[0] = 1;
        }

        if(nums[0] != 0 && nums[0] <= (total - target) / 2){
            prev[nums[0]] = 1;
        }

        for(int i = 1; i < nums.length; i++){
            int[] curr = new int[(total - target) / 2 + 1];
            curr[0] = 1;
            for(int j = 0; j <= (total - target) / 2; j++){

                int pick = 0;

                if(j - nums[i] >= 0){
                    pick = prev[j - nums[i]];
                }

                int notPick = prev[j];

                curr[j] = pick + notPick;
            }
            prev = curr;
        }

        return prev[(total - target) / 2];






        // int total = 0;

        // for(Integer i: nums){
        //     total += i;
        // }

        // if((total - target) % 2 != 0 || (total - target) < 0){
        //     return 0;
        // }

        // int[][] dp = new int[nums.length][(total - target) / 2 + 1];

        // if(nums[0] == 0){
        //     dp[0][0] = 2;
        // }
        // else{
        //     dp[0][0] = 1;
        // }

        // if(nums[0] != 0 && nums[0] <= (total - target) / 2){
        //     dp[0][nums[0]] = 1;
        // }

        // for(int i = 1; i < nums.length; i++){
        //     for(int j = 0; j <= (total - target) / 2; j++){

        //         int pick = 0;

        //         if(j - nums[i] >= 0){
        //             pick = dp[i - 1][j - nums[i]];
        //         }

        //         int notPick = dp[i - 1][j];

        //         dp[i][j] = pick + notPick;
        //     }
        // }

        // return dp[nums.length - 1][(total - target) / 2];





        // int total = 0;

        // for(Integer i: nums){
        //     total += i;
        // }

        // if((total - target) % 2 != 0 || (total - target) < 0){
        //     return 0;
        // }

        // int[][] dp = new int[nums.length][(total - target) / 2 + 1];

        // for(int i = 0; i < nums.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return targetSum(nums, nums.length - 1, (total - target) / 2, dp);



        
        // int total = 0;

        // for(Integer i: nums){
        //     total += i;
        // }

        // if((total - target) % 2 != 0){
        //     return 0;
        // }

        // return targetSum(nums, nums.length - 1, (total - target) / 2);
    }
}
