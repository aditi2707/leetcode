class Solution {

    private int bestTimeForStock(int[] prices, int i, int fee, int buy, int[][] dp){

        if(i == prices.length){
            return 0;
        }

        if(dp[i][buy] != -1){
            return dp[i][buy];
        }

        int max = 0;

        if(buy == 1){
            max = Math.max(- prices[i] - fee + bestTimeForStock(prices, i + 1, fee, 0, dp), 
            bestTimeForStock(prices, i + 1, fee, 1, dp));
        }
        else{
            max = Math.max(prices[i] + bestTimeForStock(prices, i + 1, fee, 1, dp), 
            bestTimeForStock(prices, i + 1, fee, 0, dp));
        }

        return dp[i][buy] = max;
    }


    public int maxProfit(int[] prices, int fee) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)

        int[] next = new int[2];

        for(int i = prices.length - 1; i >= 0; i--){
            int[] curr = new int[2];
            for(int j = 0; j < 2; j++){
                int max = 0;
                if(j == 1){
                    max = Math.max(- prices[i] - fee + next[0], next[1]);
                }
                else{
                    max = Math.max(prices[i] + next[1], next[0]);
                }

                curr[j] = max;
            }
            next = curr;
        }
        
        return next[1];




        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)


        // int[][] dp = new int[prices.length + 1][2];

        // for(int i = prices.length - 1; i >= 0; i--){
        //     for(int j = 0; j < 2; j++){
        //         int max = 0;
        //         if(j == 1){
        //             max = Math.max(- prices[i] - fee + dp[i + 1][0], dp[i + 1][1]);
        //         }
        //         else{
        //             max = Math.max(prices[i] + dp[i + 1][1], dp[i + 1][0]);
        //         }

        //         dp[i][j] = max;
        //     }
        // }
        
        // return dp[0][1];



        // // Time Complexity : O(n + n * 2)

        // // Space Complexity : O(n * 2 + n * 2)


        // int[][] dp = new int[prices.length][2];

        // for(int i = 0; i < prices.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // return bestTimeForStock(prices, 0, fee, 1, dp);
    }
}
