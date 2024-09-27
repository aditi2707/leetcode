class Solution {

    public int maxSumAscii(String s1, String s2, int m, int n, int[][] dp){

        if(m < 0 || n < 0){
            return 0;
        }

        if(dp[m][n] != 0){
            return dp[m][n];
        }

        if(s1.charAt(m) == s2.charAt(n)){
            dp[m][n] = (int)(s1.charAt(m)) + maxSumAscii(s1, s2, m-1, n-1, dp);
        }
        else{
            dp[m][n] = Math.max(maxSumAscii(s1, s2, m, n-1, dp), maxSumAscii(s1, s2, m-1, n, dp));
        }   
        
        return dp[m][n];
    }

    public int minimumDeleteSum(String s1, String s2) {

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int sum1 = 0;

        for(int i = 1; i <= s1.length(); i++){
            sum1 += (int)s1.charAt(i-1);
            for(int j = 1; j <= s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + (int)s1.charAt(i-1);
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }


        int sum2 = 0;

        for(int i = 0; i < s2.length(); i++){
            sum2 += (int)s2.charAt(i);
        }

        return sum1 + sum2 - dp[s1.length()][s2.length()]*2;








        // int[][] dp = new int[s1.length()][s2.length()];
        // int sum = maxSumAscii(s1, s2, s1.length()-1, s2.length()-1, dp);

        // int sum1 = 0, sum2 = 0;

        // for(int i = 0; i < s1.length(); i++){
        //     sum1 += (int)s1.charAt(i);
        // }

        // for(int i = 0; i < s2.length(); i++){
        //     sum2 += (int)s2.charAt(i);
        // }

        // return sum1 + sum2 - sum*2;
    }
}
