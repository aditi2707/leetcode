class Solution {

    private int longestSubseq(List<Integer> nums, int m, int target, int[][] dp){

        if(target == 0){
            return 0;
        }
        if(m < 0){
            return -1001;
        }

        if(dp[m][target] != -1005){
            return dp[m][target];
        }

        int pick = 0;

        if(target - nums.get(m) >= 0){
            pick = Math.max(1 + longestSubseq(nums, m - 1, target - nums.get(m), dp), 
            longestSubseq(nums, m - 1, target, dp));
        }
        else{
            pick = longestSubseq(nums, m - 1, target, dp);
        }

        return dp[m][target] = pick;
    }


    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int[] prev = new int[target + 1];

        for(int i = 1; i <= target; i++){
            if(nums.get(0) == i){
                prev[i] = 1;
            }
            else{
                prev[i] = -1001;
            }
        }

        for(int i = 1; i < nums.size(); i++){
            for(int j = target; j >= 0; j--){
                
                if(j - nums.get(i) >= 0){
                    prev[j] = Math.max(1 + prev[j - nums.get(i)], prev[j]);
                }
            }
        }

        return prev[target] < 0? -1 : prev[target];





        // int[] prev = new int[target + 1];

        // for(int i = 1; i <= target; i++){
        //     if(nums.get(0) == i){
        //         prev[i] = 1;
        //     }
        //     else{
        //         prev[i] = -1001;
        //     }
        // }

        // for(int i = 1; i < nums.size(); i++){
        //     int[] curr = new int[target + 1];
        //     for(int j = 1; j <= target; j++){
        //         int pick = 0;

        //         if(j - nums.get(i) >= 0){
        //             pick = Math.max(1 + prev[j - nums.get(i)], prev[j]);
        //         }
        //         else{
        //             pick = prev[j];
        //         }

        //         curr[j] = pick;
        //     }
        //     prev = curr;
        // }

        // return prev[target] < 0? -1 : prev[target];





        // int[][] dp = new int[nums.size()][target + 1];

        // for(int i = 1; i <= target; i++){
        //     if(nums.get(0) == i){
        //         dp[0][i] = 1;
        //     }
        //     else{
        //         dp[0][i] = -1001;
        //     }
        // }

        // for(int i = 1; i < nums.size(); i++){
        //     for(int j = 1; j <= target; j++){
        //         int pick = 0;

        //         if(j - nums.get(i) >= 0){
        //             pick = Math.max(1 + dp[i - 1][j - nums.get(i)], dp[i - 1][j]);
        //         }
        //         else{
        //             pick = dp[i - 1][j];
        //         }

        //         dp[i][j] = pick;
        //     }
        // }

        // return dp[nums.size() - 1][target] < 0? -1 : dp[nums.size() - 1][target];




        
        // int[][] dp = new int[nums.size()][target + 1];

        // for(int i = 0; i < nums.size(); i++){
        //     Arrays.fill(dp[i], -1005);
        // }

        // int ans = longestSubseq(nums, nums.size() - 1, target, dp);
        // return ans < 0? -1 : ans;
    }
}
