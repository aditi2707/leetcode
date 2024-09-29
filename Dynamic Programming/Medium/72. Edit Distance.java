class Solution {

    public int lcs(String s1, String s2, int m, int n, int[][] dp){

        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }

        if(dp[m-1][n-1] != 0){
            return dp[m-1][n-1];
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m-1][n-1] = lcs(s1, s2, m-1, n-1, dp);
        }
        else{
            int insert = lcs(s1, s2, m, n-1, dp);
            int delete = lcs(s1, s2, m-1, n, dp);
            int replace = lcs(s1, s2, m-1, n-1, dp);

            dp[m-1][n-1] = (Math.min(insert, Math.min(delete, replace)) + 1);
        }

        return dp[m-1][n-1]; 
    }

    public int minDistance(String word1, String word2) {

        if(word1.equals(word2)){
            return 0;
        }

        int[][] dp = new int[word1.length()+1][word2.length()+1];
        
        return lcs(word1, word2, word1.length(), word2.length(), dp);
    }
}
