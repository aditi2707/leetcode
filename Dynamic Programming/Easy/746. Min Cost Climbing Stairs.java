class Solution {

    // public int minCost(int[] cost, int n, int[] dp){

    //     if(n-1 == 0 || n-1 == 1){
    //         return cost[n-1];
    //     }

    //     if(dp[n-1] != -1){
    //         return dp[n-1];
    //     }
    
    //     dp[n-1] = cost[n-1] + Math.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp));
    //     return dp[n-1];
    // }

    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length];
        // for(int i = 0; i < dp.length; i++){
        //     dp[i] = -1;
        // }

        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length; i++){

            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[cost.length-1], dp[cost.length-2]);


        //return Math.min(minCost(cost, cost.length, dp), minCost(cost, cost.length-1, dp));
    }
}
