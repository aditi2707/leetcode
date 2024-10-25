class Solution {

    public int unboundedKnapsack(int[] coins, int m, int amount, int[][] dp){

        if(amount == 0){
            return 0;
        }
        if(m < 0){
            return Integer.MAX_VALUE - 1;
        }
        if(m == 0){
            if(amount % coins[m] == 0){
                return amount / coins[m];
            }
            else{
                return Integer.MAX_VALUE - 1;
            }
        }

        if(dp[m][amount] != -1){
            return dp[m][amount];
        }

        if(amount - coins[m] >= 0){
            dp[m][amount] = Math.min(unboundedKnapsack(coins, m, amount - coins[m], dp) + 1, unboundedKnapsack(coins, m-1, amount, dp));
        }
        else{
            dp[m][amount] = unboundedKnapsack(coins, m-1, amount, dp);
        }

        return dp[m][amount];
    }

    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length + 1][amount + 1];

        for(int i = 0; i <= coins.length; i++){
            Arrays.fill(dp[i], -1);
        }
        
        int ans = unboundedKnapsack(coins, coins.length-1, amount, dp);
        if(ans == Integer.MAX_VALUE - 1){
            return -1;
        }

        return ans;
    }
}
