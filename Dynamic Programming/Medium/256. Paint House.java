class Solution {

    private int paintHouse(int[][] costs, int m, int n, int[][] dp){

        if(m == costs.length - 1){
            int min = 2001;
            for(int i = 0; i < 3; i++){
                if(i != n){
                    min = Math.min(min, costs[m][i]);
                }
            }
            return min;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int min = 2001;
        for(int i = 0; i < 3; i++){
            if(i != n){
                min = Math.min(min, costs[m][i] + paintHouse(costs, m + 1, i, dp));
            }
        }

        return dp[m][n] = min;
    }

    public int minCost(int[][] costs) {

        int[] prev = new int[4];

        prev[0] = Math.min(costs[0][1], costs[0][2]);
        prev[1] = Math.min(costs[0][0], costs[0][2]);
        prev[2] = Math.min(costs[0][1], costs[0][0]);
        prev[3] = Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));

        for(int i = 1; i < costs.length; i++){
            int[] curr = new int[4];
            for(int j = 0; j < 4; j++){
                int min = 2001;
                for(int k = 0; k < 3; k++){
                    if(k != j){
                        min = Math.min(min, costs[i][k] + prev[k]);
                    }
                }
                curr[j] = min;
            }
            prev = curr;
        }

        return prev[3];







        // int[][] dp = new int[costs.length][4];

        // dp[0][0] = Math.min(costs[0][1], costs[0][2]);
        // dp[0][1] = Math.min(costs[0][0], costs[0][2]);
        // dp[0][2] = Math.min(costs[0][1], costs[0][0]);
        // dp[0][3] = Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));

        // for(int i = 1; i < costs.length; i++){
        //     for(int j = 0; j < 4; j++){
        //         int min = 2001;
        //         for(int k = 0; k < 3; k++){
        //             if(k != j){
        //                 min = Math.min(min, costs[i][k] + dp[i - 1][k]);
        //             }
        //         }
        //         dp[i][j] = min;
        //     }
        // }

        // return dp[costs.length - 1][3];



        
        // int min = 2001;
        // int[][] dp = new int[costs.length][3];

        // for(int i = 0; i < costs.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int i = 0; i < 3; i++){
        //     min = Math.min(min, paintHouse(costs, 0, i, dp));
        // }

        // return min;
    }
}
