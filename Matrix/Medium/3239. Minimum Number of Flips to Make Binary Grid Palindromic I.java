class Solution {
    public int minFlips(int[][] grid) {
        
        int rowMin = 0, colMin = 0;
        

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length/2; j++){
                if(grid[i][j] != grid[i][grid[i].length-1-j]){
                    rowMin++;
                }
            }
        }

        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length/2; j++){
                if(grid[j][i] != grid[grid.length-1-j][i]){
                    colMin++;
                }
            }
        }

        return Math.min(rowMin, colMin);
    }
}
