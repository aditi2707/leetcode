class Solution {

    private int distinctSubseq(String s, String t, int m, int n, int[][] dp){

        if(n < 0){
            return 1;
        }
        if(m < 0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int pick = 0, notPick = 0;
        if(s.charAt(m) == t.charAt(n)){
            pick = distinctSubseq(s, t, m - 1, n - 1, dp) + 
            distinctSubseq(s, t, m - 1, n, dp);
        }
        else{
            notPick = distinctSubseq(s, t, m - 1, n, dp);
        }

        return dp[m][n] = pick + notPick;
    }


    public int numDistinct(String s, String t) {

        int[] prev = new int[t.length() + 1];

        prev[0] = 1;

        for(int i = 1; i <= s.length(); i++){
            int[] curr = new int[t.length() + 1];
            curr[0] = 1;
            for(int j = 1; j <= t.length(); j++){
                int pick = 0, notPick = 0;
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    pick = prev[j - 1] + prev[j];
                }
                else{
                    notPick = prev[j];
                }

                curr[j] = pick + notPick;
            }
            prev = curr;
        }

        return prev[t.length()];





        // int[][] dp = new int[s.length() + 1][t.length() + 1];

        // for(int i = 0; i <= s.length(); i++){
        //     dp[i][0] = 1;
        // }

        // for(int i = 1; i <= s.length(); i++){
        //     for(int j = 1; j <= t.length(); j++){
        //         int pick = 0, notPick = 0;
        //         if(s.charAt(i - 1) == t.charAt(j - 1)){
        //             pick = dp[i - 1][j - 1] + dp[i - 1][j];
        //         }
        //         else{
        //             notPick = dp[i - 1][j];
        //         }

        //         dp[i][j] = pick + notPick;
        //     }
        // }

        // return dp[s.length()][t.length()];





        // int[][] dp = new int[s.length() + 1][t.length() + 1];

        // for(int i = 0; i <= s.length(); i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // return distinctSubseq(s, t, s.length() - 1, t.length() - 1, dp);
    }
}
