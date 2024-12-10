class Solution {

    public int findMinPath(int i, int j, int[][] grid, int[][] dp){

        if(i < 0 || j < 0){
            return 40001;
        }
        if(i == 0 && j == 0){
            return grid[0][0];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = grid[i][j] + findMinPath(i - 1, j, grid, dp);
        int left = grid[i][j] + findMinPath(i, j - 1, grid, dp);

        dp[i][j] = Math.min(up, left);
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {

        int[] prev = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++){
            int[] curr = new int[grid[0].length];
            int up = 0, left = 0;
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 && j == 0){
                    curr[0] = grid[0][0];
                    continue;
                }

                if(i > 0){
                    up = grid[i][j] + prev[j];
                }
                else{
                    up = 40001;
                }
                if(j > 0){
                    left = grid[i][j] + curr[j - 1];
                }
                else{
                    left = 40001;
                }

                curr[j] = Math.min(up, left);
            }

            prev = curr;
        }

        return prev[grid[0].length - 1];







        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     int up = 0, left = 0;
        //     for(int j = 0; j < grid[0].length; j++){
        //         if(i == 0 && j == 0){
        //             dp[0][0] = grid[0][0];
        //             continue;
        //         }

        //         if(i > 0){
        //             up = grid[i][j] + dp[i - 1][j];
        //         }
        //         else{
        //             up = 40001;
        //         }
        //         if(j > 0){
        //             left = grid[i][j] + dp[i][j - 1];
        //         }
        //         else{
        //             left = 40001;
        //         }

        //         dp[i][j] = Math.min(up, left);
        //     }
        // }

        // return dp[grid.length - 1][grid[0].length - 1];








        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return findMinPath(grid.length - 1, grid[0].length - 1, grid, dp);
    }
}
