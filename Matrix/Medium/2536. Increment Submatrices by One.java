class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int[][] ans = new int[n][n];

        for(int i = 0; i < queries.length; i++){
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];

            // for(int j = row1; j <= row2; j++){
            //     for(int k = col1; k <= col2; k++){
            //         ans[j][k] += 1;
            //     }
            // }

            for(int j = row1; j <= row2; j++){
                ans[j][col1] += 1;
                if(col2 + 1 < n){
                    ans[j][col2+1] -= 1;
                }
            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                ans[i][j] += ans[i][j-1];
            }
        }

        return ans;
    }
}
