class Solution {

    public int coinChange(int i, int sum, int[] coins, int[][] dp){

        if(i < 0 || sum < 0){
            return 0;
        }
        if(sum == 0){
            return 1;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int pick = coinChange(i, sum - coins[i], coins, dp);
        int notPick = coinChange(i - 1, sum, coins, dp);

        dp[i][sum] = pick + notPick;

        return dp[i][sum];
    }

    public int change(int amount, int[] coins) {

        // int[] prev = new int[amount + 1];

        // for(int i = 0; i <= amount; i++){
        //     if(i % coins[0] == 0){
        //         prev[i] = 1;
        //     }
        // }

        // for(int i = 1; i < coins.length; i++){
        //     int[] curr = new int[amount + 1];
        //     for(int j = 0; j <= amount; j++){

        //         int pick = 0;
        //         if(j >= coins[i]){
        //             pick = curr[j - coins[i]];
        //         }
        //         int notPick = prev[j];
                
        //         curr[j] = pick + notPick;
        //     }

        //     prev = curr;
        // }

        // return prev[amount];







        int[][] dp = new int[coins.length][amount + 1];

        for(int i = 0; i <= amount; i++){
            if(i % coins[0] == 0){
                dp[0][i] = 1;
            }
        }

        for(int i = 1; i < coins.length; i++){
            for(int j = 0; j <= amount; j++){

                int pick = 0;
                if(j >= coins[i]){
                    pick = dp[i][j - coins[i]];
                }
                int notPick = dp[i - 1][j];
                
                dp[i][j] = pick + notPick;
            }
        }

        return dp[coins.length - 1][amount];

        



        
        // int[][] dp = new int[coins.length][amount + 1];

        // for(int i = 0; i < coins.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return coinChange(coins.length - 1, amount, coins, dp);
    }
}
