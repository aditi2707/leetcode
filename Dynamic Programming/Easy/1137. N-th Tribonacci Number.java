class Solution {

    public int tribo(int n, int[] dp){
        if(n == 0){
            return n;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = tribo(n - 1, dp) + tribo(n - 2, dp) + tribo(n - 3, dp);
        return dp[n];
    }

    public int tribonacci(int n) {

        if(n == 0){
            return n;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        
        int prev3 = 0;
        int prev2 = 1;
        int prev = 1;

        for(int i = 3; i <= n; i++){
            int curr = prev + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;








        // if(n == 0){
        //     return n;
        // }
        // if(n == 1 || n == 2){
        //     return 1;
        // }

        // int[] dp = new int[n + 1];
        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 1;

        // for(int i = 3; i <= n; i++){
        //     dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        // }

        // return dp[n];






        
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);

        // return tribo(n, dp);
    }
}
