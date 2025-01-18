class Solution {

    private int nowaeks(int startPos, int endPos, int k, int[][] dp){

        if(k == 0){
            if(startPos == endPos){
                return 1;
            }
            return 0;
        }

        if(dp[startPos + 1001][k] != -1){
            return dp[startPos + 1001][k];
        }

        int left = nowaeks(startPos - 1, endPos, k - 1, dp);
        int right = nowaeks(startPos + 1, endPos, k - 1, dp);

        dp[startPos + 1001][k] = (left + right) % 1000000007;
        return dp[startPos + 1001][k];

    }


    public int numberOfWays(int startPos, int endPos, int k) {

        int[][] dp = new int[3001][k + 1];

        dp[startPos + 1001][k] = 1;

        for(int j = k - 1; j >= 0; j--){
            for(int i = 1; i <= 3000; i++){
                int left = 0, right = 0;
                if(i - 1 >= 0){
                    left = dp[i - 1][j + 1];
                }
                if(i + 1 <= 3000){
                    right = dp[i + 1][j + 1];
                } 
                
                dp[i][j] = (left + right) % 1000000007;
            }
        }

        return dp[endPos + 1001][0];





        
        // int[][] dp = new int[3001][k + 1];

        // for(int i = 0; i < 3001; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return nowaeks(startPos, endPos, k, dp);
    }
}
