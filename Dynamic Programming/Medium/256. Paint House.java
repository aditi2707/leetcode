class Solution {

    public int paintHouse(int i, int last, int[][] costs, int[][] dp){

        if(i == 0){
            int min = 1000000000;
            for(int j = 0; j < 3; j++){
                if(j != last){
                    min = Math.min(min, costs[0][j]);
                }
            }

            return min;
        }

        if(dp[i][last] != -1){
            return dp[i][last];
        }

        int min = 1000000000;
        for(int j = 0; j < 3; j++){
            if(last != j){
                min = Math.min(min, costs[i][j] + paintHouse(i - 1, j, costs, dp));
            }
        }

        dp[i][last] = min;
        return dp[i][last];
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
                int min = 1000000000;
                for(int k = 0; k < 3; k++){
                    if(k != j){
                        min = Math.min(min, costs[i][k] + prev[k]);
                        curr[j] = min;
                    }
                }
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
        //         int min = 1000000000;
        //         for(int k = 0; k < 3; k++){
        //             if(k != j){
        //                 min = Math.min(min, costs[i][k] + dp[i - 1][k]);
        //                 dp[i][j] = min;
        //             }
        //         }
        //     }
        // }

        // return dp[costs.length - 1][3];






        
        // int min = 1000000000;
        // int[][] dp = new int[costs.length][costs[0].length];

        // for(int i = 0; i < costs.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int j = 0; j < 3; j++){
        //     min = Math.min(min, paintHouse(costs.length - 1, j, costs, dp));
        // }

        // return min;
    }
}
