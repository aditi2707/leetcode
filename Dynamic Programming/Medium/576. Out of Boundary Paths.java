class Solution {

    private int outOfBoundPaths(int m, int n, int maxMove, int startRow, 
    int startColumn, int[][][] dp){

        if(startRow >= m || startRow < 0){
            return 1;
        }
        if(startColumn >= n || startColumn < 0){
            return 1;
        }
        if(maxMove == 0){
            return 0;
        }

        if(dp[startRow][startColumn][maxMove] != -1){
            return dp[startRow][startColumn][maxMove];
        }

        int res = 0;

        res = (res + outOfBoundPaths(m, n, maxMove - 1, startRow - 1, 
        startColumn, dp)) % 1000000007;
        res = (res + outOfBoundPaths(m, n, maxMove - 1, startRow + 1, 
        startColumn, dp)) % 1000000007;
        res = (res + outOfBoundPaths(m, n, maxMove - 1, startRow, 
        startColumn - 1, dp)) % 1000000007;
        res = (res + outOfBoundPaths(m, n, maxMove - 1, startRow, 
        startColumn + 1, dp)) % 1000000007;

        dp[startRow][startColumn][maxMove] = res;
        return dp[startRow][startColumn][maxMove];
    }


    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {


        int[][][] dp = new int[m][n][maxMove +1];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }

        return outOfBoundPaths(m, n, maxMove, startRow, startColumn, dp);
    }
}
