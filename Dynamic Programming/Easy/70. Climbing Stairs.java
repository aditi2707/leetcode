class Solution {

    // int[] dp = new int[46];
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[1] = 1;
        if(n == 1){
            return 1;
        }
        dp[2] = 2;
        if(n == 2){
            return 2;
        }
        
        // if(n == 1){
        //     return 1;
            
        // }
        // if(n == 2){
        //     return 2;
        // }

        // if(dp[n] != 0){
        //     return dp[n];
        // }

        // dp[n] = climbStairs(n-1) + climbStairs(n-2);
        // return dp[n];

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
