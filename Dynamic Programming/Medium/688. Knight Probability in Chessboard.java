class Solution {

    private double findKnightMoves(int n, int i, int j, int k, double[][][] dp){

        if(i < 0 || i >= n){
            return 0.0;
        }
        if(j < 0 || j >= n){
            return 0.0;
        }
        if(k < 0){
            return 0.0;
        }

        if(k == 0){
            return 1.0;
        }

        if(dp[i][j][k] != -1.0){
            return dp[i][j][k];
        }

        double up = findKnightMoves(n, i + 1, j + 2, k - 1, dp);
        double down = findKnightMoves(n, i + 1, j - 2, k - 1, dp);
        double left = findKnightMoves(n, i - 1, j + 2, k - 1, dp);
        double right = findKnightMoves(n, i - 1, j - 2, k - 1, dp);
        double diagUpLeft = findKnightMoves(n, i + 2, j + 1, k - 1, dp);
        double diagUpRight = findKnightMoves(n, i + 2, j - 1, k - 1, dp);
        double diagDownLeft = findKnightMoves(n, i - 2, j + 1, k - 1, dp);
        double diagDownRight = findKnightMoves(n, i - 2, j - 1, k - 1, dp);


        dp[i][j][k] = 
        (up + down + left + right + diagUpLeft + diagUpRight + diagDownLeft + 
        diagDownRight) / 8;

        return dp[i][j][k];
    }


    public double knightProbability(int n, int k, int row, int column) {

        double[][][] dp = new double[k + 1][n][n];
        dp[0][row][column] = 1.0;

        for(int c = 1; c <= k; c++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    double up = 0.0;
                    double down = 0.0;
                    double left = 0.0;
                    double right = 0.0;
                    double diagUpLeft = 0.0;
                    double diagUpRight = 0.0;
                    double diagDownLeft = 0.0;
                    double diagDownRight = 0.0;
                    if(i + 1 < n && j + 2 < n){
                        up = dp[c - 1][i + 1][j + 2];
                    }
                    if(i + 1 < n && j - 2 >= 0){
                        down = dp[c - 1][i + 1][j - 2];
                    }
                    if(i - 1 >= 0 && j + 2 < n){
                        left = dp[c - 1][i - 1][j + 2];
                    }
                    if(i - 1 >= 0 && j - 2 >= 0){
                        right = dp[c - 1][i - 1][j - 2];
                    }
                    if(i + 2 < n && j + 1 < n){
                        diagUpLeft = dp[c - 1][i + 2][j + 1];
                    }
                    if(i + 2 < n && j - 1 >= 0){
                        diagUpRight = dp[c - 1][i + 2][j - 1];
                    }
                    if(i - 2 >= 0 && j + 1 < n){
                        diagDownLeft = dp[c - 1][i - 2][j + 1];
                    }
                    if(i - 2 >= 0 && j - 1 >= 0){
                        diagDownRight = dp[c - 1][i - 2][j - 1];

                    }
                    
                    dp[c][i][j] = 
                    (up + down + left + right + diagUpLeft + diagUpRight + 
                    diagDownLeft + diagDownRight) / 8.0; 
                }
            }
        }

        double totalProbability = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                totalProbability += dp[k][i][j];
            }
        }
        return totalProbability;



        // Time Complexity : O(n ^ 2 + k(n ^ 2)).
        // The function() will run only till the size of the dp array as it stores
        // the values of previous decisions.

        // Space Complexity : O(k(n ^ 2)).
        // The dp array will take this much space.
        
        // double[][][] dp = new double[n][n][k + 1];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         Arrays.fill(dp[i][j], -1.0);
        //     }
        // }

        // double moves = findKnightMoves(n, row, column, k, dp);

        // return moves;
    }
}
