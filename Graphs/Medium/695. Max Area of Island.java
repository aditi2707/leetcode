class Solution {

    private int dfs(int[][] grid, int[][] visited, int i, int j){

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

        int left = dfs(grid, visited, i, j - 1);
        int right = dfs(grid, visited, i, j + 1);
        int up = dfs(grid, visited, i - 1, j);
        int down = dfs(grid, visited, i + 1, j);

        return 1 + left + right + up + down;
    }

    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea = 0;
        int[][] visited = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    maxArea = Math.max(maxArea, dfs(grid, visited, i, j));
                }
            }
        }

        return maxArea;
    }
}
