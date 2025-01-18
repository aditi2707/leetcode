class Solution {

    int MOD = (int) 1e9 + 7;

    private int nowtsitspass(int steps, int arrLen, int start, int[][] dp){

        if(start < 0 || start >= arrLen){
            return 0;
        }

        if(steps == 0){
            if(start == 0){
                return 1;
            }
            return 0;
        }

        if(dp[start][steps] != -1){
            return dp[start][steps];
        }

        int ways = nowtsitspass(steps - 1, arrLen, start, dp);

        if(start - 1 >= 0){
            ways = (ways + nowtsitspass(steps - 1, arrLen, start - 1, dp)) % MOD;
        }
        if(start + 1 < arrLen){
            ways = (ways + nowtsitspass(steps - 1, arrLen, start + 1, dp)) % MOD;
        }

        dp[start][steps] = ways;
        return dp[start][steps];
    }


    public int numWays(int steps, int arrLen) {
        
        int[][] dp = new int[Math.min(arrLen, steps)][steps + 1];

        for(int i = 0; i < Math.min(arrLen, steps); i++){
            Arrays.fill(dp[i], -1);
        }

        return nowtsitspass(steps, arrLen, 0, dp);
    }
}
