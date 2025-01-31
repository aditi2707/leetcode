class Solution {

    private int coinChange(int[] coins, int i, int amount, int[][] dp){

        if(i == 0){
            if(amount % coins[0] == 0){
                return amount / coins[0];
            }
            return 1000000000;
        }

        if(dp[i][amount] != -1){
            return dp[i][amount];
        }

        if(amount - coins[i] >= 0){
            dp[i][amount] = 
            Math.min(1 + coinChange(coins, i, amount - coins[i], dp), 
            coinChange(coins, i - 1, amount, dp));
        }
        else{
            dp[i][amount] = coinChange(coins, i - 1, amount, dp);
        }

        return dp[i][amount];
    }


    public int coinChange(int[] coins, int amount) {

        int[] prev = new int[amount + 1];

        for(int i = 1; i <= amount; i++){
            prev[i] = 1000000000;
        }

        for(int i = 1; i <= coins.length; i++){
            int[] curr = new int[amount + 1];
            for(int j = 1; j <= amount; j++){
                if(j - coins[i - 1] >= 0){
                    curr[j] = Math.min(1 + curr[j - coins[i - 1]], prev[j]);
                }
                else{
                    curr[j] = prev[j];
                }
            }
            prev = curr;
        }

        return prev[amount] >= 1000000000? -1 : prev[amount];





        // int[][] dp = new int[coins.length + 1][amount + 1];

        // for(int i = 1; i <= amount; i++){
        //     dp[0][i] = 1000000000;
        // }

        // for(int i = 1; i <= coins.length; i++){
        //     for(int j = 1; j <= amount; j++){
        //         if(j - coins[i - 1] >= 0){
        //             dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
        //         }
        //         else{
        //             dp[i][j] = dp[i - 1][j];
        //         }
        //     }
        // }

        // return dp[coins.length][amount] >= 1000000000? -1 : dp[coins.length][amount];





        // int[][] dp = new int[coins.length][amount + 1];

        // for(int i = 0; i < coins.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // int ans = coinChange(coins, coins.length - 1, amount, dp);
        // return ans >= 1000000000? -1 : ans;
    }
}
