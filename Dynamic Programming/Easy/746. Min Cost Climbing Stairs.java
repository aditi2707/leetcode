class Solution {

    public int minCost(int i, int[] cost, int[] dp){

        if(i == 0 || i == 1){
            return cost[i];
        }

        if(dp[i] != 1000){
            return dp[i];
        }

        dp[i] = cost[i] + 
        Math.min(minCost(i - 1, cost, dp), minCost(i - 2, cost, dp));

        return dp[i];
    }

    public int minCostClimbingStairs(int[] cost) {

        int prev2 = cost[0];
        int prev = cost[1];

        for(int i = 2; i < cost.length; i++){
            int curr = cost[i] + Math.min(prev, prev2);
            prev2 = prev;
            prev = curr;
        }

        return Math.min(prev, prev2);








        // int[] dp = new int[cost.length];

        // dp[0] = cost[0];
        // dp[1] = cost[1];

        // for(int i = 2; i < cost.length; i++){
        //     dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        // }

        // return Math.min(dp[cost.length - 1], dp[cost.length - 2]);







        
        // int[] dp = new int[cost.length];

        // Arrays.fill(dp, 1000);

        // return Math.min(minCost(cost.length - 1, cost, dp), 
        // minCost(cost.length - 2, cost, dp));
    }
}
