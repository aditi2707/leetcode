class NeighborSum {

    int[][] grid;
    Map<Integer, int[]> map = new HashMap<>();

    public NeighborSum(int[][] grid) {
        this.grid = grid;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                map.put(grid[i][j], new int[]{i, j});
            }
        }
    }
    
    public int adjacentSum(int value) {
        
        int sum = 0;
        
        int row = map.get(value)[0];
        int col = map.get(value)[1];

        if(row - 1 >= 0){
            sum += grid[row - 1][col];
        }
        if(row + 1 < grid.length){
            sum += grid[row + 1][col];
        }
        if(col - 1 >= 0){
            sum += grid[row][col - 1];
        }
        if(col + 1 < grid.length){
            sum += grid[row][col + 1];
        }

        return sum;
    }
    
    public int diagonalSum(int value) {
        
        int sum = 0;
        
        int row = map.get(value)[0];
        int col = map.get(value)[1];

        if(row - 1 >= 0 && col - 1 >= 0){
            sum += grid[row - 1][col - 1];
        }
        if(row - 1 >= 0 && col + 1 < grid.length){
            sum += grid[row - 1][col + 1];
        }
        if(row + 1 < grid.length && col - 1 >= 0){
            sum += grid[row + 1][col - 1];
        }
        if(row + 1 < grid.length && col + 1 < grid.length){
            sum += grid[row + 1][col + 1];
        }

        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
