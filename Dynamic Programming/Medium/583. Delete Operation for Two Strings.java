class Solution {

    public int lcs(String word1, String word2, int m, int n, int[][] dp){

        if(m < 0 || n < 0){
            return 0;
        }

        if(dp[m][n] != 0){
            return dp[m][n];
        }

        if(word1.charAt(m) == word2.charAt(n)){
            dp[m][n] = 1 + lcs(word1, word2, m-1, n-1, dp);
        }
        else{
            dp[m][n] = Math.max(lcs(word1, word2, m, n-1, dp), lcs(word1, word2, m-1, n, dp));
        }

        return dp[m][n];
    }

    public int minDistance(String word1, String word2) {

        int[] prev = new int[word2.length()+1];

        for(int i = 1; i <= word1.length(); i++){
            int[] curr = new int[word2.length()+1];
            for(int j = 1; j <= word2.length(); j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(curr[j-1], prev[j]);
                }
            }
            prev = curr;
        }

        return word1.length() + word2.length() - prev[word2.length()] * 2;








        // int[][] dp = new int[word1.length()+1][word2.length()+1];

        // for(int i = 1; i <= word1.length(); i++){
        //     for(int j = 1; j <= word2.length(); j++){
        //         if(word1.charAt(i-1) == word2.charAt(j-1)){
        //             dp[i][j] = 1 + dp[i-1][j-1];
        //         }
        //         else{
        //             dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        //         }
        //     }
        // }

        // return word1.length() + word2.length() - dp[word1.length()][word2.length()] * 2;






        
        // int[][] dp = new int[word1.length()+1][word2.length()+1];

        // int common = lcs(word1, word2, word1.length()-1, word2.length()-1, dp);

        // return word1.length() + word2.length() - common * 2;
    }
}
