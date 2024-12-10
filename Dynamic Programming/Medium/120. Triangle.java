class Solution {

    public int triangleSum(int i, int j, List<List<Integer>> triangle, int[][] dp){

        if(i >= triangle.size()){
            return 0;
        }
        // if(j > i){
        //     return 10001;
        // }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int diag = triangle.get(i).get(j) + triangleSum(i + 1, j + 1, triangle, dp);
        int up = triangle.get(i).get(j) + triangleSum(i + 1, j, triangle, dp);
            
        dp[i][j] = Math.min(diag, up);
        return dp[i][j];
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int[] next = new int[triangle.get(triangle.size() - 1).size()];

        for(int i = 0; i < triangle.size(); i++){
            next[i] = triangle.get(triangle.size() - 1).get(i);
        }

        for(int i = triangle.size() - 2; i >= 0; i--){
            int[] curr = new int[triangle.get(triangle.size() - 1).size()];

            for(int j = i; j >= 0; j--){
                int diag = triangle.get(i).get(j) + next[j + 1];
                int down = triangle.get(i).get(j) + next[j];
                curr[j] = Math.min(diag, down);
            }

            next = curr;
        }

        return next[0];








        // int[][] dp = 
        // new int[triangle.size()][triangle.get(triangle.size() - 1).size()];

        // for(int i = 0; i < triangle.size(); i++){
        //     dp[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
        // }

        // for(int i = triangle.size() - 2; i >= 0; i--){
        //     for(int j = i; j >= 0; j--){
        //         int diag = triangle.get(i).get(j) + dp[i + 1][j + 1];
        //         int down = triangle.get(i).get(j) + dp[i + 1][j];
        //         dp[i][j] = Math.min(diag, down);
        //     }
        // }

        // return dp[0][0];






        
        // int[][] dp = 
        // new int[triangle.size()][triangle.get(triangle.size() - 1).size()];

        // for(int i = 0; i < triangle.size(); i++){
        //     Arrays.fill(dp[i], -1);
        // }

        // return triangleSum(0, 0, triangle, dp);
    }
}
