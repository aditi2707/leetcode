class Solution {

    private int numRolls(int n, int k, int target, int[][] dp){

        if(n == 0){
            if(target == 0){
                return 1;
            }
            return 0;
        }

        if(dp[n][target] != -1){
            return dp[n][target];
        }

        int pick = 0;
        for(int i = 1; i <= k; i++){
            if(target - i >= 0){
                pick = (pick + numRolls(n - 1, k, target - i, dp)) % 1000000007;
            }
        }

        return dp[n][target] = pick % 1000000007;
    }


    public int numRollsToTarget(int n, int k, int target) {

        int[] prev = new int[target + 1];

        prev[0] = 1;
        
        for(int i = 1; i <= n; i++){
            int[] curr = new int[target + 1];
            for(int j = 1; j <= target; j++){
                int pick = 0;
                for(int p = 1; p <= k; p++){
                    if(j - p >= 0){
                        pick = (pick + prev[j - p]) % 1000000007;
                    }
                }
                curr[j] = pick % 1000000007;   
            }
            prev = curr;
        }

        return prev[target];





        // int[][] dp = new int[n + 1][target + 1];

        // dp[0][0] = 1;
        
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= target; j++){
        //         int pick = 0;
        //         for(int p = 1; p <= k; p++){
        //             if(j - p >= 0){
        //                 pick = (pick + dp[i - 1][j - p]) % 1000000007;
        //             }
        //         }
        //         dp[i][j] = pick % 1000000007;   
        //     }
        // }

        // return dp[n][target];



        
        // int[][] dp = new int[n + 1][target + 1];

        // for(int i = 0; i <= n; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return numRolls(n, k, target, dp);
    }
}
