class Solution {

    public int allFruits(int[] prices, int i, int[] dp){

        if(i >= prices.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int free = prices[i] + allFruits(prices, (2 * i) + 2, dp);
        int notFree = 1000000000;

        for(int j = i + 1; j <= (2 * i) + 1; j++){
            notFree = Math.min(notFree, prices[i] + allFruits(prices, j, dp));
        }

        dp[i] = Math.min(free, notFree);
        return dp[i];
    }

    public int minimumCoins(int[] prices) {

        int[] dp = new int[prices.length];
        // dp[prices.length - 1] = prices[prices.length - 1];
        
        for(int i = prices.length - 1; i >= 0; i--){
            int free = prices[i]; 
            int notFree = 1000000000;
            if((2 * i) + 2 < prices.length){
                free += dp[(2 * i) + 2];
            }

            for(int j = i + 1; j <= (2 * i) + 1; j++){
                if(j < prices.length){
                    notFree = Math.min(notFree, prices[i] + dp[j]);
                }
            }

            dp[i] = Math.min(free, notFree);
        }

        return dp[0];




        
        // int[] dp = new int[prices.length];
        // Arrays.fill(dp, -1);

        // return allFruits(prices, 0, dp);
    }
}
