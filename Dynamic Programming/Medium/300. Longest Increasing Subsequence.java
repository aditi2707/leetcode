class Solution {

    private int LIS(int[] nums, int index, int prevInd, int[][] dp){

        if(index == nums.length){
            return 0;
        }

        if(dp[index][prevInd + 1] != -1){
            return dp[index][prevInd + 1];
        }

        int max = 0;

        if(prevInd == -1 || nums[index] > nums[prevInd]){
            max = Math.max(1 + LIS(nums, index + 1, index, dp), 
            LIS(nums, index + 1, prevInd, dp));
        }
        else{
            max = LIS(nums, index + 1, prevInd, dp);
        }

        return dp[index][prevInd + 1] = max;
    }


    public int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        int maxF = 1;

        Arrays.fill(dp, 1);

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                int max = 1;

                if(nums[i] > nums[j]){
                    dp[i] = Math.max(1 + dp[j], dp[i]);
                }

                maxF = Math.max(maxF, dp[i]);
            }
        }

        return maxF;




        // int[][] dp = new int[nums.length][nums.length + 1];

        // for(int i = 0; i < nums.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // return LIS(nums, 0, -1, dp);
    }
}
