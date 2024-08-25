class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    rows[i] -= 1;
                    cols[j] -= 1;
                }
                else{
                    rows[i] += 1;
                    cols[j] += 1;
                }
            }
        }

        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < cols.length; j++){
                grid[i][j] = rows[i] + cols[j];
            }
        }

        return grid;
    }
}
