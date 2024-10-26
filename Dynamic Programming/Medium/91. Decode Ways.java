class Solution {

    public int decodeWays(String s, int m, int[] dp){

        if(m >= s.length()){
            return 1;
        }
        if(s.charAt(m) == '0'){
            return 0;
        }

        if(dp[m] != -1){
            return dp[m];
        }

        dp[m] = decodeWays(s, m+1, dp);

        if((m+1 < s.length() && s.charAt(m) == '1') || (m+1 < s.length() && s.charAt(m) == '2' && s.charAt(m+1) >= '0' && s.charAt(m+1) <= '6')){
            dp[m] += decodeWays(s, m+2, dp);
        }

        return dp[m];
    }

    public int numDecodings(String s) {
        
        int[] dp = new int[s.length()];

        Arrays.fill(dp, -1);
        return decodeWays(s, 0, dp);

    }
}
