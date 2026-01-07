class Solution {

    private int findWinner(int[] piles, int i, int j, int[][] dp){

        if(i >= j){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        int start = piles[i] + findWinner(piles, i + 1, j - 1, dp);
        int end = piles[j] + findWinner(piles, i + 1, j - 1, dp);

        return dp[i][j] = Math.max(start, end);
    }


    public boolean stoneGame(int[] piles) {

        // Time Complexity : O(n + (n * n))

        // Space Complexity : O((n * n) + (n / 2))


        int[][] dp = new int[piles.length][piles.length];
        
        int total = 0;

        for(int i = 0; i < piles.length; i++){
            total += piles[i];
        }

        int ans = findWinner(piles, 0, piles.length - 1, dp);

        return ans > total - ans;
    }
}
