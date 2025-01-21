class Solution {

    private int minDiff(int[][] mat, int m, int sum, int target, int[][] dp){

        if(m >= mat.length){
            return Math.abs(target - sum);
        }

        if(dp[m][sum] != -1){
            return dp[m][sum];
        }

        int min = 5000;
        for(int i = 0; i < mat[0].length; i++){
            min = Math.min(min, minDiff(mat, m + 1, sum + mat[m][i], target, dp));
        }

        return dp[m][sum] = min;
    }

    public int minimizeTheDifference(int[][] mat, int target) {

        int[] next = new int[5001];
        int ans = 5000;

        for(int i = 0; i < 5001; i++){
            next[i] = Math.abs(target - i);
        }

        for(int i = mat.length - 1; i >= 0; i--){
            int[] curr = new int[5001];
            for(int j = 5000; j >= 0; j--){
                int min = 5000;
                for(int k = 0; k < mat[0].length; k++){
                    if(j + mat[i][k] <= 5000){
                        min = Math.min(min, next[j + mat[i][k]]);
                    }
                }
                curr[j] = min;
            }
            next = curr;
        }

        return next[0];





        
        // int[][] dp = new int[mat.length + 1][5001];
        // int ans = 5000;

        // for(int i = 0; i < 5001; i++){
        //     dp[mat.length][i] = Math.abs(target - i);
        // }

        // for(int i = mat.length - 1; i >= 0; i--){
        //     for(int j = 5000; j >= 0; j--){
        //         int min = 5000;
        //         for(int k = 0; k < mat[0].length; k++){
        //             if(j + mat[i][k] <= 5000){
        //                 min = Math.min(min, dp[i + 1][j + mat[i][k]]);
        //             }
        //         }
        //         dp[i][j] = min;
        //     }
        // }

        // return dp[0][0];




        // int[][] dp = new int[mat.length][5001];

        // for(int i = 0; i < mat.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return minDiff(mat, 0, 0, target, dp);
    }
}
