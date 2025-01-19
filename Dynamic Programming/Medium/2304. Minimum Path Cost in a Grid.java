class Solution {

    private int minPathCost(int[][] grid, int[][] moveCost, int m, int n, int[][] dp){

        if(m == grid.length - 1){
            return grid[m][n];
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int min = 5001;
        for(int i = 0; i < grid[0].length; i++){
            min = Math.min(min, grid[m][n] + moveCost[grid[m][n]][i] + 
            minPathCost(grid, moveCost, m + 1, i, dp));
        }

        return dp[m][n] = min;
    }

    public int minPathCost(int[][] grid, int[][] moveCost) {

        int ans = 5001;
        int[] prev = new int[grid[0].length];

        for(int i = 0; i < grid[0].length; i++){
            prev[i] = grid[grid.length - 1][i];
        }

        for(int i = grid.length - 2; i >= 0; i--){
            int[] curr = new int[grid[0].length];
            for(int j = 0; j < grid[0].length; j++){
                int min = 5001;
                for(int k = 0; k < grid[0].length; k++){
                    min = Math.min(min, grid[i][j] + 
                    moveCost[grid[i][j]][k] + prev[k]);
                }
                curr[j] = min;
                if(i == 0){
                    ans = Math.min(ans, curr[j]);
                }
            }
            prev = curr;
        }

        return ans;







        // int ans = 5001;
        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid[0].length; i++){
        //     dp[grid.length - 1][i] = grid[grid.length - 1][i];
        // }

        // for(int i = grid.length - 2; i >= 0; i--){
        //     for(int j = 0; j < grid[0].length; j++){
        //         int min = 5001;
        //         for(int k = 0; k < grid[0].length; k++){
        //             min = Math.min(min, grid[i][j] + 
        //             moveCost[grid[i][j]][k] + dp[i + 1][k]);
        //         }
        //         dp[i][j] = min;
        //         if(i == 0){
        //             ans = Math.min(ans, dp[i][j]);
        //         }
        //     }
        // }

        // return ans;





        
        // int min = 5001;
        // int[][] dp = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int i = 0; i < grid[0].length; i++){
        //     for(int j = 0; j < moveCost[0].length; j++){
        //         min = Math.min(min, 
        //         grid[0][i] + moveCost[grid[0][i]][j] + 
        //         minPathCost(grid, moveCost, 1, j, dp));
        //     }
        // }

        // return min;
    }
}
