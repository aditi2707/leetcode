class Solution {

    public int countWays(int n, int[] dp){

        if(n == 1 || n == 2){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
        return dp[n];
    }

    public int climbStairs(int n) {

        if(n == 1 || n == 2){
            return n;
        }
        
        int prev = 2;
        int prev2 = 1;

        for(int i = 3; i <= n; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;









        // if(n == 1 || n == 2){
        //     return n;
        // }

        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);

        // dp[1] = 1;
        // dp[2] = 2;

        // for(int i = 3; i <= n; i++){
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }

        // return dp[n];






        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);

        // return countWays(n, dp);
        






        // Time Limit Exceeded

        // if(n == 1 || n == 2){
        //     return n;
        // }

        // return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
