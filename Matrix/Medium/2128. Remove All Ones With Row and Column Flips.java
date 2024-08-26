class Solution {

    public boolean removeOnes(int[][] grid) {
        
        for(int i = 0; i < grid[0].length; i++){
            if(grid[0][i] == 1){
                grid[0][i] = 0;
                for(int j = 1; j < grid.length; j++){
                    if(grid[j][i] == 1){
                        grid[j][i] = 0;
                    }
                    else{
                        grid[j][i] = 1;
                    }
                }
            }
        }

        for(int i = 1; i < grid.length; i++){
            for(int j = 0; j < grid[0].length-1; j++){
                if(grid[i][j] != grid[i][j+1]){
                    return false;
                }
            }
        }

        return true;
    }
}
