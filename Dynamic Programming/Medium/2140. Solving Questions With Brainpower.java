class Solution {

    public long brainpower(int i, int[][] questions, long[] dp){

        if(i >= questions.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        long pick = questions[i][0] + 
        brainpower(i + questions[i][1] + 1, questions, dp);

        long notPick = brainpower(i + 1, questions, dp);

        dp[i] = Math.max(pick, notPick);
        return dp[i];
    }

    public long mostPoints(int[][] questions) {

        
        long[] dp = new long[questions.length];
        dp[dp.length - 1] = questions[questions.length - 1][0];

        for(int i = questions.length - 2; i >= 0; i--){
            long pick = questions[i][0];
            if(i + questions[i][1] + 1 < questions.length){
                pick += dp[i + questions[i][1] + 1];
            }

            long notPick = 0;
            if(i + 1 < questions.length){
                notPick = dp[i + 1];
            }

            dp[i] = Math.max(pick, notPick);
        }

        return dp[0];






        
        // long[] dp = new long[questions.length];

        // Arrays.fill(dp, -1);

        // return brainpower(0, questions, dp);
    }
}
