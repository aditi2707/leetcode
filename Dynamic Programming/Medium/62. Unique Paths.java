class Solution {

    public int findPaths(int i, int j, int[][] dp){

        if(i < 0 || j < 0){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int left = findPaths(i, j - 1, dp);
        int up = findPaths(i - 1, j, dp);

        dp[i][j] = left + up;
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {

        int[] prev = new int[n];
        Arrays.fill(prev, 1);

        for(int i = 1; i < m; i++){
            int[] curr = new int[n];
            Arrays.fill(curr, 1);

            for(int j = 1; j < n; j++){
                curr[j] = curr[j - 1] + prev[j];
            }
            prev = curr;
        }

        return prev[n - 1];







        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], 1);
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        return dp[m - 1][n - 1];






        
        // int[][] dp = new int[m][n];

        // for(int i = 0; i < m; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return findPaths(m - 1, n - 1, dp);
    }
}
