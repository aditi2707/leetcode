class Solution {

    private int findMinSum(int[][] grid, int m, int n, int[][] dp){

        if(m == grid.length - 1 && n == grid[0].length - 1){
            return grid[m][n];
        }

        if(m >= grid.length || n >= grid[0].length){
            return 40001;
        }

        if(dp[m][n] != 40001){
            return dp[m][n];
        }

        int down = grid[m][n] + findMinSum(grid, m + 1, n, dp);
        int right = grid[m][n] + findMinSum(grid, m, n + 1, dp);

        return dp[m][n] = Math.min(down, right);
    }


    public int minPathSum(int[][] grid) {

        int[] prev = new int[grid[0].length];

        prev[0] = grid[0][0];

        for(int i = 1; i < grid[0].length; i++){
            prev[i] = grid[0][i] + prev[i - 1];
        }

        for(int i = 1; i < grid.length; i++){
            int[] curr = new int[grid[0].length];
            curr[0] = grid[i][0] + prev[0];
            for(int j = 1; j < grid[0].length; j++){
                int down = grid[i][j] + prev[j];
                int right = grid[i][j] + curr[j - 1];

                curr[j] = Math.min(down, right);
            }
            prev = curr;
        }

        return prev[grid[0].length - 1];




        // int[][] dp = new int[grid.length][grid[0].length];

        // dp[0][0] = grid[0][0];

        // for(int i = 1; i < grid[0].length; i++){
        //     dp[0][i] = dp[0][i - 1] + grid[0][i];
        // }
        // for(int i = 1; i < grid.length; i++){
        //     dp[i][0] = dp[i - 1][0] + grid[i][0];
        // }

        // for(int i = 1; i < grid.length; i++){
        //     for(int j = 1; j < grid[0].length; j++){
        //         int down = grid[i][j] + dp[i - 1][j];
        //         int right = grid[i][j] + dp[i][j - 1];

        //         dp[i][j] = Math.min(down, right);
        //     }
        // }

        // return dp[grid.length - 1][grid[0].length - 1];





        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], 40001);
        // }
        
        // return findMinSum(grid, 0, 0, dp);
    }
}
