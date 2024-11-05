class Solution {

    public int dfs(int[][] grid, int i, int j){

        if(i < 0 || i >= grid.length){
            return 0;
        }
        if(j < 0 || j >= grid[0].length){
            return 0;
        }
        if(grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;

        return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + 
                    dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
    }



    public int bfs(int[][] grid, int i, int j){

        int count = 1;
        Queue<Integer> queue = new LinkedList<>();
        int n = grid[0].length;

        queue.add(i * n + j);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            int row = curr / n;
            int col = curr % n;

            if(row + 1 < grid.length && grid[row + 1][col] == 1){
                queue.add((row + 1) * n + col);
                grid[row + 1][col] = 0;
                count++;
            }
            if(col + 1 < grid[0].length && grid[row][col + 1] == 1){
                queue.add(row * n + (col + 1));
                grid[row][col + 1] = 0;
                count++;
            }
            if(row - 1 >= 0 && grid[row - 1][col] == 1){
                queue.add((row - 1) * n + col);
                grid[row - 1][col] = 0;
                count++;
            }
            if(col - 1 >= 0 && grid[row][col - 1] == 1){
                queue.add(row * n + (col - 1));
                grid[row][col - 1] = 0;
                count++;
            }
        }

        return count;
    }


    public int maxAreaOfIsland(int[][] grid) {

        int area = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == 1){
                    area = Math.max(area, dfs(grid, i, j));
                }
            }
        }

        return area;






        
        // int area = 0;

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){

        //         if(grid[i][j] == 1){
        //             area = Math.max(area, bfs(grid, i, j));
        //         }
        //     }
        // }

        // return area;
    }
}
