class Solution {

    private int maxMoves(int[][] grid, int m, int n, int[][] dp){

        if(m < 0 || m >= grid.length){
            return 0;
        }
        if(n >= grid[0].length){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int diagUp = 0, right = 0, diagDown = 0;

        if(n + 1 < grid[0].length){
            if(m - 1 >= 0 && grid[m - 1][n + 1] > grid[m][n]){
                diagUp = 1 + maxMoves(grid, m - 1, n + 1, dp);
            }
            if(m + 1 < grid.length && grid[m + 1][n + 1] > grid[m][n]){
                diagDown = 1 + maxMoves(grid, m + 1, n + 1, dp);
            }
            if(grid[m][n + 1] > grid[m][n]){
                right = 1 + maxMoves(grid, m, n + 1, dp);
            }
        }

        return dp[m][n] = Math.max(diagUp, Math.max(right, diagDown));
    }


    public int maxMoves(int[][] grid) {

        int max = 0;
        int[] next = new int[grid.length];

        for(int j = grid[0].length - 2; j >= 0; j--){
            int[] curr = new int[grid.length];
            
            for(int i = 0; i < grid.length; i++){

                int diagUp = 0, right = 0, diagDown = 0;

                if(i - 1 >= 0 && grid[i - 1][j + 1] > grid[i][j]){
                    diagUp = 1 + next[i - 1];
                }
                if(i + 1 < grid.length && grid[i + 1][j + 1] > grid[i][j]){
                    diagDown = 1 + next[i + 1];
                }
                if(grid[i][j + 1] > grid[i][j]){
                    right = 1 + next[i];
                }
                curr[i] = Math.max(diagUp, Math.max(right, diagDown));
            }
            next = curr;
        }

        for(int i = 0; i < grid.length; i++){
            max = Math.max(max, next[i]);
        }

        return max;







        // int max = 0;
        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int j = grid[0].length - 2; j >= 0; j--){
        //     for(int i = 0; i < grid.length; i++){

        //         int diagUp = 0, right = 0, diagDown = 0;

        //         if(i - 1 >= 0 && grid[i - 1][j + 1] > grid[i][j]){
        //             diagUp = 1 + dp[i - 1][j + 1];
        //         }
        //         if(i + 1 < grid.length && grid[i + 1][j + 1] > grid[i][j]){
        //             diagDown = 1 + dp[i + 1][j + 1];
        //         }
        //         if(grid[i][j + 1] > grid[i][j]){
        //             right = 1 + dp[i][j + 1];
        //         }
        //         dp[i][j] = Math.max(diagUp, Math.max(right, diagDown));
        //         if(j == 0){
        //             max = Math.max(max, dp[i][j]);
        //         }
        //     }
        // }

        // return max;
        




        
        // int max = 0;
        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int i = 0; i < grid.length; i++){
        //     max = Math.max(max, maxMoves(grid, i, 0, dp));
        // }

        // return max;
    }
}
