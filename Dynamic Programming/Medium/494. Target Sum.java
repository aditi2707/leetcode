class Solution {

    public int targetSum(int[] nums, int i, int target, int[][] dp){

        if(i == 0){
            if(nums[0] == 0 && target == 0){
                return 2;
            }
            if(nums[0] == target || target == 0){
                return 1;
            }
            return 0;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int notPick = targetSum(nums, i - 1, target, dp);
        int pick = 0;
        if(target >= nums[i]){
            pick = targetSum(nums, i - 1, target - nums[i], dp);
        }

        dp[i][target] = pick + notPick;
        return dp[i][target];
    }

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for(Integer i: nums){
            sum += i;
        }

        if((target + sum) % 2 != 0 || (target + sum) < 0){
            return 0;
        }

        int totalSum = (target + sum) / 2;

        int[] prev = new int[totalSum + 1];

        if(nums[0] == 0){
            prev[0] = 2;
        }
        else{
            prev[0] = 1;
        }
        
        if(nums[0] != 0 && nums[0] <= totalSum){
			prev[nums[0]] = 1;
		}

        for(int i = 1; i < nums.length; i++){
            int[] curr = new int[totalSum + 1];
            for(int j = 0; j <= totalSum; j++){
                int notPick = prev[j];
                int pick = 0;
                if(j >= nums[i]){
                    pick = prev[j - nums[i]];
                }

                curr[j] = pick + notPick;
            }
            prev = curr;
        }

        return prev[totalSum];







        // int sum = 0;

        // for(Integer i: nums){
        //     sum += i;
        // }

        // if((target + sum) % 2 != 0 || (target + sum) < 0){
        //     return 0;
        // }

        // int totalSum = (target + sum) / 2;

        // int[][] dp = new int[nums.length][totalSum + 1];

        // if(nums[0] == 0){
        //     dp[0][0] = 2;
        // }
        // else{
        //     dp[0][0] = 1;
        // }
        
        // if(nums[0] != 0 && nums[0] <= totalSum){
		// 	dp[0][nums[0]] = 1;
		// }

        // for(int i = 1; i < nums.length; i++){
        //     for(int j = 0; j <= totalSum; j++){
        //         int notPick = dp[i - 1][j];
        //         int pick = 0;
        //         if(j >= nums[i]){
        //             pick = dp[i - 1][j - nums[i]];
        //         }

        //         dp[i][j] = pick + notPick;
        //     }
        // }

        // return dp[nums.length - 1][totalSum];






        // int sum = 0;

        // for(Integer i: nums){
        //     sum += i;
        // }

        // if((target + sum) % 2 != 0 || (target + sum) < 0){
        //     return 0;
        // }

        // int totalSum = (target + sum) / 2;

        // int[][] dp = new int[nums.length][totalSum + 1];

        // for(int i = 0; i < nums.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return targetSum(nums, nums.length - 1, totalSum, dp);






        // int sum = 0;

        // for(Integer i: nums){
        //     sum += i;
        // }

        // if((target + sum) % 2 != 0 || (target + sum) < 0){
        //     return 0;
        // }

        // int totalSum = (target + sum) / 2;

        // return targetSum(nums, nums.length - 1, totalSum);
    }
}
