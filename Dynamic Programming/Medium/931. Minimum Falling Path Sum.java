class Solution {

    public int fallingPathSum(int i, int j, int[][] matrix, int[][] dp){

        if(j < 0 || j >= matrix.length){
            return 10001;
        }
        if(i == 0){
            return matrix[i][j];
        }

        if(dp[i][j] != -10001){
            return dp[i][j];
        }

        int up = matrix[i][j] + fallingPathSum(i - 1, j, matrix, dp);
        int diagL = matrix[i][j] + fallingPathSum(i - 1, j - 1, matrix, dp);
        int diagR = matrix[i][j] + fallingPathSum(i - 1, j + 1, matrix, dp);

        dp[i][j] = Math.min(up, Math.min(diagL, diagR));
        return dp[i][j];
    }

    public int minFallingPathSum(int[][] matrix) {

        int min = 10001;
        int[] prev = new int[matrix.length];

        for(int j = 0; j < matrix.length; j++){
            prev[j] = matrix[0][j];
        }

        for(int i = 1; i < matrix.length; i++){
            int[] curr = new int[matrix.length];
            int diagL = 10001, diagR = 10001;
            for(int j = 0; j < matrix.length; j++){
                int up = matrix[i][j] + prev[j];

                if(j > 0){
                    diagL = matrix[i][j] + prev[j - 1];
                }
                if(j < matrix.length - 1){
                    diagR = matrix[i][j] + prev[j + 1];
                }

                curr[j] = Math.min(up, Math.min(diagR, diagL));
            }

            prev = curr;
        }

        for(int j = 0; j < prev.length; j++){
            min = Math.min(min, prev[j]);
        }


        return min;









        // int min = 10001;
        // int[][] dp = new int[matrix.length][matrix.length];

        // for(int j = 0; j < matrix.length; j++){
        //     dp[0][j] = matrix[0][j];
        // }

        // for(int i = 1; i < matrix.length; i++){
        //     int diagL = 10001, diagR = 10001;
        //     for(int j = 0; j < matrix.length; j++){
        //         int up = matrix[i][j] + dp[i - 1][j];

        //         if(j > 0){
        //             diagL = matrix[i][j] + dp[i - 1][j - 1];
        //         }
        //         if(j < matrix.length - 1){
        //             diagR = matrix[i][j] + dp[i - 1][j + 1];
        //         }

        //         dp[i][j] = Math.min(up, Math.min(diagR, diagL));
        //     }
        // }

        // for(int j = 0; j < dp.length; j++){
        //     min = Math.min(min, dp[dp.length - 1][j]);
        // }


        // return min;

        






        // int min = 10001;
        // int[][] dp = new int[matrix.length][matrix.length];

        // for(int i = 0; i < matrix.length; i++){
        //     Arrays.fill(dp[i], -10001);
        // }

        // for(int j = 0; j < matrix.length; j++){
        //     min = Math.min(min, fallingPathSum(matrix.length - 1, j, matrix, dp));
        // }

        // return min;
    }
}
