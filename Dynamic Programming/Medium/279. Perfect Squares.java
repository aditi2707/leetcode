class Solution {

    public int perfectSquares(int i, int n, int[][] dp){

        if(n == 0){
            return 0;
        }
        if(i == 0){
            return 1000000000;
        }

        if(dp[i][n] != -1){
            return dp[i][n];
        }

        if(n >= (i * i)){
            dp[i][n] = Math.min(1 + perfectSquares(i, n - (i * i), dp), 
            perfectSquares(i - 1, n, dp));
        }
        else{
            dp[i][n] = perfectSquares(i - 1, n, dp);
        }

        return dp[i][n];
    }

    public int numSquares(int n) {

        int[] prev = new int[n + 1];

        Arrays.fill(prev, 1000000000);
        
        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            int[] curr = new int[n + 1];
            for(int j = 1; j <= n; j++){
                if(j >= (i * i)){
                    curr[j] = Math.min(1 + curr[j - (i * i)], prev[j]);
                }
                else{
                    curr[j] = prev[j];
                }
            }
            prev = curr;
        }
        
        return prev[n];






        // int[][] dp = new int[(int)Math.sqrt(n) + 1][n + 1];

        // for(int i = 0; i <= n; i++){
        //     dp[0][i] = 1000000000;
        // }
        
        // for(int i = 1; i <= (int)Math.sqrt(n); i++){
        //     for(int j = 1; j <= n; j++){
        //         if(j >= (i * i)){
        //             dp[i][j] = Math.min(1 + dp[i][j - (i * i)], dp[i - 1][j]);
        //         }
        //         else{
        //             dp[i][j] = dp[i - 1][j];
        //         }
        //     }
        // }
        
        // return dp[(int)Math.sqrt(n)][n];






        
        // int[][] dp = new int[(int)Math.sqrt(n) + 1][n + 1];

        // for(int i = 0; i <= (int)Math.sqrt(n); i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // return perfectSquares((int)Math.sqrt(n), n, dp);
    }
}
