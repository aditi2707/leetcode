class Solution {

    private int onesZeroes(int[] zeroes, int[] ones, int m, int n, int i, 
    int[][][] dp){

        if(m < 0 || n < 0){
            return -60001;
        }
        if(i < 0){
            return 0;
        }

        if(dp[i][m][n] != -60001){
            return dp[i][m][n];
        }

        int choice1 = 1 + 
        onesZeroes(zeroes, ones, m - zeroes[i], n - ones[i], i - 1, dp);

        // int choice2 = 1 + onesZeroes(zeroes, ones, m, n - ones[i], i - 1);
        // int choice3 = 1 + onesZeroes(zeroes, ones, m - zeroes[i], n, i - 1);

        int choice4 = onesZeroes(zeroes, ones, m, n, i - 1, dp);

        return dp[i][m][n] = Math.max(choice1, choice4);
    }


    public int findMaxForm(String[] strs, int m, int n) {
        
        int[] ones = new int[strs.length];
        int[] zeroes = new int[strs.length];

        for(int i = 0; i < strs.length; i++){
            char[] s = strs[i].toCharArray();
            for(char c: s){
                if(c == '1'){
                    ones[i]++;
                }
                else{
                    zeroes[i]++;
                }
            }
        }

        int[][][] dp = new int[strs.length][m + 1][n + 1];

        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j <= m; j++){
                Arrays.fill(dp[i][j], -60001);
            }
        }

        return onesZeroes(zeroes, ones, m, n, strs.length - 1, dp);
    }
}
