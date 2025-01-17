class Solution {

    private int fallingPathSum(int[][] matrix, int i, int j, int[][] dp){

        if(j < 0 || j >= matrix[0].length){
            return 10000;
        }
        if(i == matrix.length - 1){
            return matrix[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int diagRight = matrix[i][j] + fallingPathSum(matrix, i + 1, j + 1, dp);
        int down = matrix[i][j] + fallingPathSum(matrix, i + 1, j, dp);
        int diagLeft = matrix[i][j] + fallingPathSum(matrix, i + 1, j - 1, dp);

        dp[i][j] = Math.min(diagRight, Math.min(down, diagLeft));
        return dp[i][j];
    }

    public int minFallingPathSum(int[][] matrix) {

        int min = 10000;
        int[] prev = new int[matrix[0].length];

        for(int i = 0; i < matrix[0].length; i++){
            prev[i] = matrix[0][i];
        }

        for(int i = 1; i < matrix.length; i++){
            int[] curr = new int[matrix[0].length];
            for(int j = 0; j < matrix[0].length; j++){

                int diagRight = 10000;
                int diagLeft = 10000;

                if(j + 1 < matrix[0].length){
                    diagRight = matrix[i][j] + prev[j + 1];
                }
                int down = matrix[i][j] + prev[j];
                if(j - 1 >= 0){
                    diagLeft = matrix[i][j] + prev[j - 1];
                }

                curr[j] = Math.min(diagRight, Math.min(down, diagLeft));
            }
            prev = curr;
        }

        for(int i = 0; i < matrix[0].length; i++){
            min = Math.min(min, prev[i]);
        }

        return min;






        // int min = 10000;
        // int[][] dp = new int[matrix.length][matrix[0].length];

        // for(int i = 0; i < matrix[0].length; i++){
        //     dp[0][i] = matrix[0][i];
        // }

        // for(int i = 1; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){

        //         int diagRight = 10000;
        //         int diagLeft = 10000;

        //         if(j + 1 < matrix[0].length){
        //             diagRight = matrix[i][j] + dp[i - 1][j + 1];
        //         }
        //         int down = matrix[i][j] + dp[i - 1][j];
        //         if(j - 1 >= 0){
        //             diagLeft = matrix[i][j] + dp[i - 1][j - 1];
        //         }

        //         dp[i][j] = Math.min(diagRight, Math.min(down, diagLeft));
        //     }
        // }

        // for(int i = 0; i < matrix[0].length; i++){
        //     min = Math.min(min, dp[matrix.length - 1][i]);
        // }

        // return min;






        
        // int min = 10000;
        // int[][] dp = new int[matrix.length][matrix[0].length];

        // for(int i = 0; i < matrix.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int i = 0; i < matrix[0].length; i++){
        //     min = Math.min(min, fallingPathSum(matrix, 0, i, dp));
        // }

        // return min;
    }
}
