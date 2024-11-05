class Solution {

    public void bfs(char[][] grid, int i, int j, int[][] visited){

        int n = grid.length;
        int m = grid[0].length;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(i * m + j);

        visited[i][j] = 1;

        while(!queue.isEmpty()){
            int land = queue.poll();

            int landI = land / m;
            int landJ = land % m;


            if(landJ + 1 < grid[0].length && grid[landI][landJ + 1] == '1' && visited[landI][landJ + 1] == 0){
                queue.add(landI * m + landJ + 1);
                visited[landI][landJ] = 1;
            }
            if(landI + 1 < grid.length && grid[landI + 1][landJ] == '1' && visited[landI + 1][landJ] == 0){
                queue.add((landI + 1) * m + landJ);
                visited[landI][landJ] = 1;
            }
            if(landJ - 1 >= 0 && grid[landI][landJ - 1] == '1' && visited[landI][landJ - 1] == 0){
                queue.add(landI * m + landJ - 1);
                visited[landI][landJ] = 1;
            }
            if(landI - 1 >= 0 && grid[landI - 1][landJ] == '1' && visited[landI - 1][landJ] == 0){
                queue.add((landI - 1) * m + landJ);
                visited[landI][landJ] = 1;
            }
        }
    }

    public int numIslands(char[][] grid) {
        
        if(grid.length == 0){
            return 0;
        }

        int[][] visited = new int[grid.length][grid[0].length];
        int island = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    bfs(grid, i, j, visited);
                    island++;
                }
            }
        }

        return island;
    }
}
