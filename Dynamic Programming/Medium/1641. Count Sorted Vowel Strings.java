class Solution {

    public int countStrings(int n, int v, int[][] dp){

        if(n == 1){
            return v;
        }

        if(v == 1){
            return 1;
        }

            return dp[n][v];
        }

        dp[n][v] = countStrings(n, v-1, dp) + countStrings(n-1, v, dp);
        return dp[n][v];
    }

    public int countVowelStrings(int n) {

        // Time Complexity : O(5 + (4 * n))

        // Space Complexity : O(5)
        
        
        int[] freq = new int[5];

        Arrays.fill(freq, 1);
        int sum = 0;

        if(n == 1){
            return 5;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 3; j >= 0; j--){
                freq[j] += freq[j + 1];
                if(i == n){
                    sum += freq[j];
                }
            }
        }

        return sum + freq[4];




        
        
        int[][] dp = new int[n+1][6];

        for(int i = 1; i <= 5; i++){
            dp[1][i] = i;
        }

        for(int i = 1; i <= n; i++){
            dp[i][1] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        
        return dp[n][5];
        //return countStrings(n, 5, dp);
    }
}
