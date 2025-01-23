class Solution {

    private boolean isCommunicate(int[][] grid, int m, int n, int i, int j, 
    int[][] visited){

        if(i < 0 || i >= grid.length){
            return false;
        }
        if(j < 0 || j >= grid[0].length){
            return false;
        }
        if(i != m && j != n){
            return false;
        }
        if(visited[i][j] == 1){
            return false;
        }

        if(grid[i][j] == 1 && (i != m || j != n)){
            return true;
        }

        visited[i][j] = 1;

        boolean up = isCommunicate(grid, m, n, i - 1, j, visited);
        boolean down = isCommunicate(grid, m, n, i + 1, j, visited);
        boolean left = isCommunicate(grid, m, n, i, j - 1, visited);
        boolean right = isCommunicate(grid, m, n, i, j + 1, visited);

        visited[i][j] = 0;

        return up || down || left || right;
    }


    public int countServers(int[][] grid) {

        int count = 0;
        int[] rowCount = new int[grid.length];
        int[] colCount = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)){
                    count++;
                }
            }
        }

        return count;


        

        // int count = 0;
        // int[][] visited = new int[grid.length][grid[0].length];

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){
                
        //         if(grid[i][j] == 1 && isCommunicate(grid, i, j, i, j, visited)){
        //             count++;
        //         }
        //     }
        // }

        // return count;
    }
}
