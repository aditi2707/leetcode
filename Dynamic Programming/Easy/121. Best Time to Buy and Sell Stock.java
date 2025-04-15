class Solution {

    
    public int maxProfit(int[] prices) {

        // Time Complexity : O(n)
        // There is some improvement like if at any point, the left is greater than
        // high, then we have to find the first lowest value, which would be at high
        // so the low will now point at high.

        // Space Complexity : O(1)
        

        int low = 0, high = 1;
        int max = 0;

        while(high < prices.length){
            if(prices[low] < prices[high]){
                max = Math.max(max, prices[high] - prices[low]);
            }
            else{
                low = high;
            }
            high++;
        }

        return max;





        // // Time Complexity : O(n)
        // // The for loop will run for the entirety of the array, irrespective of any
        // // best/worse case.

        // // Space Complexity : O(1)

        
        // int costPrice = prices[0];
        // int max = 0;

        // for(int i = 1; i < prices.length; i++){
        //     int profit = prices[i] - costPrice;
        //     max = Math.max(max, profit);
        //     costPrice = Math.min(costPrice, prices[i]);
        // }

        // return max;


        

       // // Time Complexity : O(n * 2)
        
       // // Space Complexity : O(n)
        

       // int[] dp = new int[prices.length];
       // dp[0] = prices[0];
       // int max = 0;

       // for(int i = 1; i < prices.length; i++){
       //      dp[i] = Math.min(dp[i-1], prices[i]);
       // }

       // for(int i = 0; i < prices.length; i++){
       //      max = Math.max(max, prices[i] - dp[i]);
       // }

       // return max;
    }
}
