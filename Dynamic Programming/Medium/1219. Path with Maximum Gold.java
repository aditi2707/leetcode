class Solution {

    private int goldPath(int[][] grid, int i, int j, int[][] visited){

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

        int up = grid[i][j] + goldPath(grid, i - 1, j, visited);
        int down = grid[i][j] + goldPath(grid, i + 1, j, visited);
        int left = grid[i][j] + goldPath(grid, i, j - 1, visited);
        int right = grid[i][j] + goldPath(grid, i, j + 1, visited);

        visited[i][j] = 0;

        return Math.max(up, Math.max(down, Math.max(left, right)));
    }

    public int getMaximumGold(int[][] grid) {
        
        int max = 0;
        int[][] visited = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    max = Math.max(max, goldPath(grid, i, j, visited));
                }
            }
        }

        return max;
    }
}
