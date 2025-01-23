class Solution {

    private int bfs(int[][] grid, int[][] visited){

        Queue<int[]> queue = new LinkedList<>();
        int time = 0;
        int fresh = 0, rotten = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i, j, 0});
                    visited[i][j] = 1;
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        while(!queue.isEmpty()){

            int[] poll = queue.poll();
            int i = poll[0];
            int j = poll[1];
            int t = poll[2];

            time = Math.max(time, t);

            if(i + 1 < grid.length){
                if(grid[i + 1][j] == 1 && visited[i + 1][j] == 0){
                    queue.add(new int[]{i + 1, j, t + 1});
                    visited[i + 1][j] = 1;
                    rotten++;
                }
            }
            if(i - 1 >= 0){
                if(grid[i - 1][j] == 1 && visited[i - 1][j] == 0){
                    queue.add(new int[]{i - 1, j, t + 1});
                    visited[i - 1][j] = 1;
                    rotten++;
                }
            }
            if(j + 1 < grid[0].length){
                if(grid[i][j + 1] == 1 && visited[i][j + 1] == 0){
                    queue.add(new int[]{i, j + 1, t + 1});
                    visited[i][j + 1] = 1;
                    rotten++;
                }
            }
            if(j - 1 >= 0){
                if(grid[i][j - 1] == 1 && visited[i][j - 1] == 0){
                    queue.add(new int[]{i, j - 1, t + 1});
                    visited[i][j - 1] = 1;
                    rotten++;
                }
            }
        }

        if(fresh != rotten){
            return -1;
        }

        return time;
    }


    public int orangesRotting(int[][] grid) {
        
        int[][] visited = new int[grid.length][grid[0].length];

        int time = bfs(grid, visited);

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){
        //         if(grid[i][j] == 1 && visited[i][j] != 1){
        //             return -1;
        //         }
        //     }
        // }

        return time;
    }
}
