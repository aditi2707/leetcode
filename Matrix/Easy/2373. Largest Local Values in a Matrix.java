class Solution {

    public int maxValue(int[][] grid, int m, int n){

        int max = 0;

        for(int i = m; i < m + 3; i++){
            for(int j = n; j < n + 3; j++){
                max = Math.max(max, grid[i][j]);
            }
        }

        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        
        int[][] ans = new int[grid.length - 2][grid.length - 2];

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                ans[i][j] = maxValue(grid, i, j);
            }
        }

        return ans;
    }
}
