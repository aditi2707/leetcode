class Solution {

    int[] dp = new int[31];
    public int fib(int n) {

        // int[] dp = new int[n+1];

        // if(n == 0){
        //     return 0;
        // }
        // dp[0] = 0;
        // dp[1] = 1;

        // for(int i = 2; i <= n; i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }

        // return dp[n];
        
        if(n == 1 || n == 0){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }
}
