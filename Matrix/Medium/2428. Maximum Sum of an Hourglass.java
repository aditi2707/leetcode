class Solution {
    public int maxSum(int[][] grid) {

        int[][] prefix = new int[grid.length][grid[0].length+1];
        int max = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                prefix[i][j+1] = prefix[i][j] + grid[i][j];
            }
        }

        for(int i = 0; i < grid.length-2; i++){
            int sum = 0;
            for(int j = 3; j <= grid[0].length; j++){
                sum = prefix[i][j] - prefix[i][j-3] + grid[i+1][j-2] + prefix[i+2][j] - prefix[i+2][j-3];
                max = Math.max(max, sum);
            }
        }

        return max;
        
        // int c1 = 0, r = 0;
        // int max = 0;

        // while(r+2 < grid.length){
        //     int c2 = c1 + 2;
        //     int sum = grid[r][c1] + grid[r][c1+1] + grid[r][c2] + grid[r+1][c1+1] + grid[r+2][c1] + grid[r+2][c1+1] + grid[r+2][c2];
        //     max = Math.max(max, sum);

        //     c1++;
        //     if(c1+2 >= grid[0].length){
        //         r++;
        //         c1 = 0;
        //     }
        // }

        // return max;
    }
}
