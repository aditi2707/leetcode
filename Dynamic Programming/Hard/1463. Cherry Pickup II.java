class Solution {

    public int pickCherries(int i, int j1, int j2, int[][] grid, int[][][] dp){

        if(j1 < 0 || j1 >= grid[0].length || j2 < 0 || j2 >= grid[0].length){
            return -1;
        }
        if(i == grid.length - 1){
            if(j1 == j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1] + grid[i][j2];
            }
        }

        if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }

        int max = 0;
        for(int p = -1; p <= 1; p++){
            for(int q = -1; q <= 1; q++){
                if(j1 == j2){
                    max = Math.max(max, 
                    grid[i][j1] + pickCherries(i + 1, j1 + p, j2 + q, grid, dp));
                }
                else{
                    max = Math.max(max, grid[i][j1] + grid[i][j2] + 
                    pickCherries(i + 1, j1 + p, j2 + q, grid, dp));
                }
            }
        }

        dp[i][j1][j2] = max;
        return dp[i][j1][j2];
    }

    public int cherryPickup(int[][] grid) {

        int[][][] dp = new int[grid.length][grid[0].length][grid[0].length];

        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == j){
                    dp[grid.length - 1][i][j] = grid[grid.length - 1][j];
                }
                else{
                    dp[grid.length - 1][i][j] = grid[grid.length - 1][j] + 
                    grid[grid.length - 1][i];
                }
            }
        }

        for(int i = grid.length - 2; i >= 0; i--){
            for(int j1 = 0; j1 < grid[0].length; j1++){
                for(int j2 = 0; j2 < grid[0].length; j2++){
                    int max = 0;
                    for(int p = -1; p <= 1; p++){
                        for(int q = -1; q <= 1; q++){
                            if(j1 == j2){
                                if(j1 + p >= 0 && j1 + p < grid[0].length && 
                                j2 + q >= 0 && j2 + q < grid[0].length){
                                    max = Math.max(max, 
                                    grid[i][j1] + dp[i + 1][j1 + p][j2 + q]);
                                }
                                
                            }
                            else{
                                if(j1 + p >= 0 && j1 + p < grid[0].length && 
                                j2 + q >= 0 && j2 + q < grid[0].length){
                                    max = Math.max(max, grid[i][j1] + grid[i][j2] + 
                                    dp[i + 1][j1 + p][j2 + q]);
                                }
                                
                            }
                        }
                    }
                    dp[i][j1][j2] = max;
                }
            }
        }

        return dp[0][0][grid[0].length - 1];

        






        
        // int[][][] dp = new int[grid.length][grid[0].length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){
        //         Arrays.fill(dp[i][j], -1);
        //     }
        // }

        // return pickCherries(0, 0, grid[0].length - 1, grid, dp);
    }
}
