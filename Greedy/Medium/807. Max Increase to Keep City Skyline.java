class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        // Time Complexity : O(n * n)

        // Space Complexity : O(n * 2)
        
        
        int[] maxRow = new int[grid.length];
        int[] maxCol = new int[grid.length];
        int sum = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                sum += Math.min(Math.abs(grid[i][j] - maxRow[i]), Math.abs(grid[i][j] - maxCol[j]));
            }
        }

        return sum;
    }
}
