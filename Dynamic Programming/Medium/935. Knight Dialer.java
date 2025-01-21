class Solution {

    private int knightDialer(int[][] jumps, int i, int steps, int[][] dp){

        if(steps == 0){
            return 1;
        }

        if(dp[i][steps] != -1){
            return dp[i][steps];
        }

        int count = 0;

        for(Integer j: jumps[i]){
            count = (count + knightDialer(jumps, j, steps - 1, dp)) % 1000000007;
        }

        return dp[i][steps] = count % 1000000007;
    }


    public int knightDialer(int n) {

        int[][] jumps = {
            {4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {3, 9, 0},
            {},
            {1, 7, 0},
            {2, 6},
            {1, 3},
            {2, 4}
        };

        int count = 0;
        int[] prev = new int[10];

        for(int i = 0; i < 10; i++){
            prev[i] = 1;
        }

        for(int i = 1; i < n; i++){
            int[] curr = new int[10];
            for(int j = 0; j < 10; j++){

                int c = 0;
                for(Integer k: jumps[j]){
                    c = (c + prev[k]) % 1000000007;
                }
                curr[j] = c;
            }
            prev = curr;
        }

        for(int i = 0; i < 10; i++){
            count = (count + prev[i]) % 1000000007;
        }

        return count;






        // int[][] jumps = {
        //     {4, 6},
        //     {6, 8},
        //     {7, 9},
        //     {4, 8},
        //     {3, 9, 0},
        //     {},
        //     {1, 7, 0},
        //     {2, 6},
        //     {1, 3},
        //     {2, 4}
        // };

        // int count = 0;
        // int[][] dp = new int[n][10];

        // for(int i = 0; i < 10; i++){
        //     dp[0][i] = 1;
        // }

        // for(int i = 1; i < n; i++){
        //     for(int j = 0; j < 10; j++){

        //         int c = 0;
        //         for(Integer k: jumps[j]){
        //             c = (c + dp[i - 1][k]) % 1000000007;
        //         }
        //         dp[i][j] = c;
        //     }
        // }

        // for(int i = 0; i < 10; i++){
        //     count = (count + dp[n - 1][i]) % 1000000007;
        // }

        // return count;





        
        // int[][] jumps = {
        //     {4, 6},
        //     {6, 8},
        //     {7, 9},
        //     {4, 8},
        //     {3, 9, 0},
        //     {},
        //     {1, 7, 0},
        //     {2, 6},
        //     {1, 3},
        //     {2, 4}
        // };

        // int count = 0;
        // int[][] dp = new int[10][n];

        // for(int i = 0; i < 10; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // for(int i = 0; i < 10; i++){
        //     count = (count + knightDialer(jumps, i, n - 1, dp)) % 1000000007;
        // }

        // return count;
    }
}
