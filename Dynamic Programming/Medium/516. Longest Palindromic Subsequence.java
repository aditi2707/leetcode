class Solution {

    public int lps(String s, String t, int m, int n){

        if(m < 0 || n < 0){
            return 0;
        }
        

        if(s.charAt(m) == t.charAt(n)){
            return 1 + lps(s, t, m-1, n-1);
        }
        
        return Math.max(lps(s, t, m, n-1), lps(s, t, m-1, n));
    }

    public int longestPalindromeSubseq(String s) {

        String rev = "";
        int[][] dp = new int[s.length()+1][s.length()+1];

        for(int i = 0; i < s.length(); i++){
            rev = s.charAt(i) + rev;
        }

        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= s.length(); j++){
                if(s.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[s.length()][s.length()];
        
        // return lps(s, rev, s.length()-1, rev.length()-1);
    }
}
