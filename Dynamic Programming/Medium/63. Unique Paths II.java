class Solution {

    public int findPaths(int i, int j, int[][] obstacleGrid, int[][] dp){

        if(i < 0 || j < 0){
            return 0;
        }
        if(obstacleGrid[i][j] == 1){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int left = findPaths(i, j - 1, obstacleGrid, dp);
        int up = findPaths(i - 1, j, obstacleGrid, dp);

        dp[i][j] = left + up;
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[] prev = new int[obstacleGrid[0].length];

        for(int i = 0; i < obstacleGrid.length; i++){
            int up = 0, left = 0;
            int[] curr = new int[obstacleGrid[0].length];

            for(int j = 0; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 1){
                    curr[j] = 0;
                    continue;
                }
                
                if(i == 0 && j == 0){
                    curr[j] = 1;
                    continue;
                }

                if(i > 0){
                    up = prev[j];
                }
                if(j > 0){
                    left = curr[j - 1];
                }

                curr[j] = up + left;
            }

            prev = curr;
        }

        return prev[obstacleGrid[0].length - 1];







        // int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        // for(int i = 0; i < obstacleGrid.length; i++){
        //     int up = 0, left = 0;
        //     for(int j = 0; j < obstacleGrid[0].length; j++){
        //         if(obstacleGrid[i][j] == 1){
        //             dp[i][j] = 0;
        //             continue;
        //         }

        //         if(i == 0 && j == 0){
        //             dp[0][0] = 1;
        //             continue;
        //         }

        //         if(i > 0){
        //             up = dp[i - 1][j];
        //         }
        //         if(j > 0){
        //             left = dp[i][j - 1];
        //         }

        //         dp[i][j] = up + left;
        //     }
        // }

        // return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];







        
        // int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        // for(int i = 0; i < obstacleGrid.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return findPaths(obstacleGrid.length - 1, obstacleGrid[0].length - 1,
        // obstacleGrid, dp);
    }
}
