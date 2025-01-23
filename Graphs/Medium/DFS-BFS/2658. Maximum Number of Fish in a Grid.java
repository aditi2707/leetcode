class Solution {

    private int maxFish(int[][] grid, int i, int j, int[][] visited){

        if(i < 0 || i >= grid.length){
            return 0;
        }
        if(j < 0 || j >= grid[0].length){
            return 0;
        }
        if(grid[i][j] == 0 || visited[i][j] == 1){
            return 0;
        }

        visited[i][j] = 1;

        int up = maxFish(grid, i - 1, j, visited);
        int down = maxFish(grid, i + 1, j, visited);
        int left = maxFish(grid, i, j - 1, visited);
        int right = maxFish(grid, i, j + 1, visited);

        return grid[i][j] + up + down + left + right;
    }


    public int findMaxFish(int[][] grid) {
        
        int maxFish = 0;
        int[][] visited = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    maxFish = Math.max(maxFish, maxFish(grid, i, j, visited));
                }
            }
        }

        return maxFish;
    }
}
