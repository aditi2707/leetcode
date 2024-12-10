class Solution {

    public int fibonacci(int n, int[] dp){

        if(n == 0 || n == 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }

    public int fib(int n) {

        if(n == 0 || n == 1){
            return n;
        }

        int prev2 = 0;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            int curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }

        return prev;







        // if(n == 0 || n == 1){
        //     return n;
        // }

        // int[] dp = new int[n + 1];
        // dp[0] = 0;
        // dp[1] = 1;

        // for(int i = 2; i <= n; i++){
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }

        // return dp[n];






        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);

        // return fibonacci(n, dp);




        
        // if(n == 0 || n == 1){
        //     return n;
        // }

        // return fib(n - 1) + fib(n - 2);
    }
}
