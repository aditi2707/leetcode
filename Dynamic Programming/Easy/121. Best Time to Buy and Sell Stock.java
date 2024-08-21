class Solution {

    
    public int maxProfit(int[] prices) {

       int[] dp = new int[prices.length];
       dp[0] = prices[0];
       int max = 0;

       for(int i = 1; i < prices.length; i++){
            dp[i] = Math.min(dp[i-1], prices[i]);
       }

       for(int i = 0; i < prices.length; i++){
            max = Math.max(max, prices[i] - dp[i]);
       }

       return max;
    }
}
