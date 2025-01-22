class Solution {

    private boolean isSubsequence(String s, String t, int m, int n, int[][] dp){

        if(m < 0){
            return true;
        }

        if(n < 0){
            return false;
        }

        if(dp[m][n] != -1){
            return dp[m][n] == 1;
        }

        boolean equal = false;
        if(s.charAt(m) == t.charAt(n)){
            equal = isSubsequence(s, t, m - 1, n - 1, dp);
        }
        boolean notEqual = isSubsequence(s, t, m, n - 1, dp);

        boolean result = equal || notEqual;

        if(result){
            dp[m][n] = 1;
        }
        else{
            dp[m][n] = 0;
        }

        return result; 
    }


    public boolean isSubsequence(String s, String t) {

        if(s.length() > t.length()){
            return false;
        }

        boolean[] prev = new boolean[t.length() + 1];

        for(int i = 0; i <= t.length(); i++){
            prev[i] = true;
        }

        for(int i = 1; i <= s.length(); i++){
            boolean[] curr = new boolean[t.length() + 1];
            for(int j = 1; j <= t.length(); j++){
                boolean equal = false;
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    equal = prev[j - 1];
                }
                boolean notEqual = curr[j - 1];

                curr[j] = equal || notEqual;
            }
            prev = curr;
        }

        return prev[t.length()];





        // if(s.length() > t.length()){
        //     return false;
        // }

        // boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];

        // dp[0][0] = true;

        // for(int i = 0; i <= t.length(); i++){
        //     dp[0][i] = true;
        // }

        // for(int i = 1; i <= s.length(); i++){
        //     for(int j = 1; j <= t.length(); j++){
        //         boolean equal = false;
        //         if(s.charAt(i - 1) == t.charAt(j - 1)){
        //             equal = dp[i - 1][j - 1];
        //         }
        //         boolean notEqual = dp[i][j - 1];

        //         dp[i][j] = equal || notEqual;
        //     }
        // }

        // return dp[s.length()][t.length()];
        




        // if(s.length() > t.length()){
        //     return false;
        // }

        // int[][] dp = new int[s.length()][t.length()];

        // for(int i = 0; i < s.length(); i++){
        //     Arrays.fill(dp[i], -1);
        // }
        
        // return isSubsequence(s, t, s.length() - 1, t.length() - 1, dp);
    }
}
