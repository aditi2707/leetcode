class Solution {

    private void dfs(int[][] grid, int[][] visited, int i, int j){

        if(i < 0 || i >= grid.length){
            return;
        }
        if(j < 0 || j >= grid[0].length){
            return;
        }

        if(grid[i][j] == 0 || visited[i][j] == 1){
            return;
        }

        visited[i][j] = 1;
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j - 1);

        return;
    }

    public int numEnclaves(int[][] grid) {
        
        int[][] visited = new int[grid.length][grid[0].length];
        int enclaves = 0;

        for(int j = 0; j < grid[0].length; j++){
            if(grid[0][j] == 1 && visited[0][j] == 0){
                dfs(grid, visited, 0, j);
            }
            if(grid[grid.length - 1][j] == 1 && visited[grid.length - 1][j] == 0){
                dfs(grid, visited, grid.length - 1, j);
            }
        }

        for(int i = 0; i < grid.length; i++){
            if(grid[i][0] == 1 && visited[i][0] == 0){
                dfs(grid, visited, i, 0);
            }
            if(grid[i][grid[0].length - 1] == 1 && 
            visited[i][grid[0].length - 1] == 0){
                dfs(grid, visited, i, grid[0].length - 1);
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    enclaves++;
                }
            }
        }

        return enclaves;
    }
}
