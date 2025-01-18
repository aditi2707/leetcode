class Solution {

    private int minFallingPathSumii(int[][] grid, int m, int n, int[][] dp){

        if(m == grid.length - 1){
            int min = 20000;
            for(int i = 0; i < grid.length; i++){
                if(i != n){
                    min = Math.min(min, grid[m][i]);
                }
            }
            return min;
        }

        if(dp[m][n] != -100){
            return dp[m][n];
        }

        int min = 20000;

        for(int i = 0; i < grid.length; i++){
            if(i != n){
                min = Math.min(min, grid[m][i] + 
                    minFallingPathSumii(grid, m + 1, i, dp));
            }
        }

        return dp[m][n] = min;
    }


    public int minFallingPathSum(int[][] grid) {

        if(grid.length == 1){
            return grid[0][0];
        }

        int[] prev = new int[grid.length + 1];
        int totalMin = 20000;

        for(int i = 0; i < grid.length; i++){
            int min = 20000;
            totalMin = Math.min(totalMin, grid[0][i]);
            for(int j = 0; j < grid.length; j++){
                if(j != i){
                    min = Math.min(min, grid[0][j]);
                }
            }
            prev[i] = min;
        }
        prev[grid.length] = totalMin;

        for(int i = 1; i < grid.length; i++){
            int[] curr = new int[grid.length + 1];
            for(int j = 0; j <= grid.length; j++){
                int min = 20000;
                for(int k = 0; k < grid.length; k++){
                    if(k != j){
                        min = Math.min(min, grid[i][k] + prev[k]);
                    }
                }
                curr[j] = min;
            }
            prev = curr;
        }

        return prev[grid.length];






        // if(grid.length == 1){
        //     return grid[0][0];
        // }

        // int[][] dp = new int[grid.length][grid.length + 1];
        // int totalMin = 20000;

        // for(int i = 0; i < grid.length; i++){
        //     int min = 20000;
        //     totalMin = Math.min(totalMin, grid[0][i]);
        //     for(int j = 0; j < grid.length; j++){
        //         if(j != i){
        //             min = Math.min(min, grid[0][j]);
        //         }
        //     }
        //     dp[0][i] = min;
        // }
        // dp[0][grid.length] = totalMin;

        // for(int i = 1; i < grid.length; i++){
        //     for(int j = 0; j <= grid.length; j++){
        //         int min = 20000;
        //         for(int k = 0; k < grid.length; k++){
        //             if(k != j){
        //                 min = Math.min(min, grid[i][k] + dp[i - 1][k]);
        //             }
        //         }
        //         dp[i][j] = min;
        //     }
        // }

        // return dp[grid.length - 1][grid.length];





        // if(grid.length == 1){
        //     return grid[0][0];
        // }

        // int min = 20000;
        // int[][] dp = new int[grid.length][grid.length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], -100);
        // }

        // for(int i = 0; i < grid.length; i++){
        //     min = Math.min(min, minFallingPathSumii(grid, 0, i, dp));
        // }

        // return min;
    }
}
