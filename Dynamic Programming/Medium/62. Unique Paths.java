class Solution {

    public int findPaths(int[][] dp, int m, int n){

        if(m == dp.length - 1 && n == dp[0].length - 1){
            return 1;
        }

        if(m >= dp.length || n >= dp[0].length){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        dp[m][n] = findPaths(dp, m, n+1) + findPaths(dp, m+1, n);

        return dp[m][n];
    }

    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }

        return findPaths(dp, 0, 0);
    }
}
