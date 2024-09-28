class Solution {

    // public int lcs(String s1, String s2, int m, int n, int[][] dp){

    //     if(m < 0 || n < 0){
    //         return 0;
    //     }

    //     if(dp[m][n] != 0){
    //         return dp[m][n];
    //     }

    //     if(s1.charAt(m) == s2.charAt(n)){
    //         dp[m][n] = 1 + lcs(s1, s2, m-1, n-1, dp);
    //     }
    //     else{
    //         dp[m][n] = Math.max(lcs(s1, s2, m, n-1, dp), lcs(s1, s2, m-1, n, dp));
    //     }

    //     return dp[m][n];
    // }

    public int longestCommonSubsequence(String text1, String text2) {
        
        int[] prev = new int[text2.length()+1];

        for(int i = 1; i <= text1.length(); i++){
            int[] curr = new int[text2.length()+1];
            for(int j = 1; j <= text2.length(); j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(curr[j-1], prev[j]);
                }
            }
            prev = curr;
        }

        return prev[text2.length()];
    }
}
