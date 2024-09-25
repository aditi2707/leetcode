class Solution {

    public boolean isPalin(String s, int m, int n, boolean[][] dp){

        if(m >= n){
            return true;
        }

        if(dp[m][n]){
            return true;
        }

        if(s.charAt(m) != s.charAt(n)){
            return false;
        }

        dp[m][n] = isPalin(s, m+1, n-1, dp);
        return dp[m][n];
    }

    public int countSubstrings(String s) {

        int count = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
            count++;
        }

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                count++;
            }
        }

        for(int i = 3; i <= s.length(); i++){
            for(int k = 0, j = k + i - 1; j < s.length(); k++, j++){
                dp[k][j] = dp[k+1][j-1] && s.charAt(k) == s.charAt(j);
                if(dp[k][j]){
                    count++;
                }
            }
        }

        return count;





        
        // int count = 0;

        // boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];

        // for(int i = 0; i < s.length(); i++){
        //     for(int j = i; j < s.length(); j++){
        //         if(dp[i][j]){
        //             count++;
        //         }
        //         else if(isPalin(s, i, j, dp)){
        //             count++;
        //         }
        //     }
        // }

        // return count;
    }
}
