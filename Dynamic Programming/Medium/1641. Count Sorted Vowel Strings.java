class Solution {

    public int countStrings(int n, int v, int[][] dp){

        if(n == 1){
            return v;
        }

        if(v == 1){
            return 1;
        }

            return dp[n][v];
        }

        dp[n][v] = countStrings(n, v-1, dp) + countStrings(n-1, v, dp);
        return dp[n][v];
    }

    public int countVowelStrings(int n) {
        
        int[][] dp = new int[n+1][6];

        for(int i = 1; i <= 5; i++){
            dp[1][i] = i;
        }

        for(int i = 1; i <= n; i++){
            dp[i][1] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        
        return dp[n][5];
        //return countStrings(n, 5, dp);
    }
}
