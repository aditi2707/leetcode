class Solution {

    
    public int maxProfit(int[] prices) {

        // int low = 0, high = 1;
        // int max = 0;

        // while(high < prices.length){
        //     if(prices[low] > prices[high]){
        //         low = high;
        //         high++;
        //     }
        //     else{
        //         max = Math.max(max, prices[high] - prices[low]);
        //         high++;
        //     }
        // }

        // return max;



        

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
