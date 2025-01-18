class Solution {

    int MOD = 1000000007;

    private int studentAttendanceRecord(int n, int absNum, int lateNum, int[][][] dp){

        if(absNum >= 2 || lateNum >= 3){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(dp[n][absNum][lateNum] != -1){
            return dp[n][absNum][lateNum];
        }

        int count = 0;
        count = studentAttendanceRecord(n - 1, absNum, 0, dp) % MOD;

        count = (count + studentAttendanceRecord(n - 1, absNum + 1, 0, dp)) % MOD;
        
        count = (count + studentAttendanceRecord(n - 1, absNum, lateNum + 1, dp)) 
        % MOD;

        return dp[n][absNum][lateNum] = count;
    }


    public int checkRecord(int n) {

        int[][] prev = new int[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                prev[i][j] = 1;
            }
        }

        for(int i = 1; i <= n; i++){
            int[][] curr = new int[2][3];

            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 3; k++){
                    int count = 0;
                    count = (prev[j][0]) % MOD;

                    if(j + 1 < 2){
                        count = (count + prev[j + 1][0]) % MOD;
                    }
                    if(k + 1 < 3){
                        count = (count + prev[j][k + 1]) % MOD;
                    }
        
                    curr[j][k] = count;
                }
            }
            prev = curr;
        }

        return prev[0][0];






        // int[][][] dp = new int[n + 1][2][3];

        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 3; j++){
        //         dp[0][i][j] = 1;
        //     }
        // }

        // for(int i = 1; i <= n; i++){
        //     for(int j = 0; j < 2; j++){
        //         for(int k = 0; k < 3; k++){

        //             int count = 0;
        //             count = (dp[i - 1][j][0]) % MOD;

        //             if(j + 1 < 2){
        //                 count = (count + dp[i - 1][j + 1][0]) % MOD;
        //             }
        //             if(k + 1 < 3){
        //                 count = (count + dp[i - 1][j][k + 1]) % MOD;
        //             }
        
        //             dp[i][j][k] = count;
        //         }
        //     }
        // }

        // return dp[n][0][0];




        
        // int[][][] dp = new int[n + 1][2][3];

        // for(int i = 0; i <= n; i++){
        //     for(int j = 0; j < 2; j++){
        //         Arrays.fill(dp[i][j], -1);
        //     }
        // }

        // return studentAttendanceRecord(n, 0, 0, dp);
    }
}
