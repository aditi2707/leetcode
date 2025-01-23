class Solution {

    private boolean closedIslands(int[][] grid, int[][] visited, int i, int j){

        if(i < 0 || i >= grid.length){
            return false;
        }
        if(j < 0 || j >= grid[0].length){
            return false;
        }

        if(grid[i][j] == 1 || visited[i][j] == 1){
            return true;
        }

        visited[i][j] = 1;

        boolean down = closedIslands(grid, visited, i + 1, j);
        boolean up = closedIslands(grid, visited, i - 1, j);
        boolean right = closedIslands(grid, visited, i, j + 1);
        boolean left = closedIslands(grid, visited, i, j - 1);

        return down && up && right && left;
    }

    private void dfs(int[][] grid, int[][] visited, int i, int j){

        if(i < 0 || i >= grid.length){
            return;
        }
        if(j < 0 || j >= grid[0].length){
            return;
        }

        if(grid[i][j] == 1 || visited[i][j] == 1){
            return;
        }

        visited[i][j] = 1;

        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i, j - 1);

        return;
    }

    public int closedIsland(int[][] grid) {

        int[][] visited = new int[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0 && visited[i][j] == 0 && 
                closedIslands(grid, visited, i, j)){
                    count++;
                }
            }
        }

        return count;






        
        // int[][] visited = new int[grid.length][grid[0].length];
        // int count = 0;

        // for(int i = 0; i < grid[0].length; i++){
        //     if(grid[0][i] == 0 && visited[0][i] == 0){
        //         dfs(grid, visited, 0, i);
        //     }
        //     if(grid[grid.length - 1][i] == 0 && visited[grid.length - 1][i] == 0){
        //         dfs(grid, visited, grid.length - 1, i);
        //     }
        // }

        // for(int i = 0; i < grid.length; i++){
        //     if(grid[i][0] == 0 && visited[i][0] == 0){
        //         dfs(grid, visited, i, 0);
        //     }
        //     if(grid[i][grid[0].length - 1] == 0 && 
        //     visited[i][grid[0].length - 1] == 0){
        //         dfs(grid, visited, i, grid[0].length - 1);
        //     }
        // }

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){
        //         if(grid[i][j] == 0 && visited[i][j] == 0){
        //             count++;
        //             dfs(grid, visited, i, j);
        //         }
        //     }
        // }

        // return count;
    }
}
