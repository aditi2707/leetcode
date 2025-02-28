class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        String ans = "";

        for(int i = 1; i <= str1.length(); i++){
            for(int j = 1; j <= str2.length(); j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int i = str1.length(), j = str2.length();

        while(i > 0 && j > 0){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                ans = str1.charAt(i - 1) + ans;
                i--;
                j--;
            }
            else{
                if(dp[i - 1][j] > dp[i][j - 1]){
                    ans = str1.charAt(i - 1) + ans;
                    i--;
                }
                else{
                    ans = str2.charAt(j - 1) + ans;
                    j--;
                }
            }
        }

        while(i > 0){
            ans = str1.charAt(i - 1) + ans;
            i--;
        }
        while(j > 0){
            ans = str2.charAt(j - 1) + ans;
            j--;
        }

        return ans;
    }
}
