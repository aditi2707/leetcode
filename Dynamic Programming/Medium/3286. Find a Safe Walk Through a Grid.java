class Solution {

    private boolean safeWalk(List<List<Integer>> grid, int health, int m, int n, 
    int[][] visited, int[][][] dp){

        if(health <= 0){
            return false;
        }

        if(m < 0 || m >= grid.size()){
            return false;
        }
        if(n < 0 || n >= grid.get(0).size()){
            return false;
        }

        if(visited[m][n] == 1){
            return false;
        }

        if(m == grid.size() - 1 && n == grid.get(0).size() - 1){
            if(health - grid.get(m).get(n) <= 0){
                return false;
            }
            return true;
        }

        if(dp[m][n][health] != -1){
            return dp[m][n][health] == 1;
        }

        visited[m][n] = 1;

        boolean up = 
        safeWalk(grid, health - grid.get(m).get(n), m - 1, n, visited, dp);

        boolean down = 
        safeWalk(grid, health - grid.get(m).get(n), m + 1, n, visited, dp);

        boolean left = 
        safeWalk(grid, health - grid.get(m).get(n), m, n - 1, visited, dp);

        boolean right = 
        safeWalk(grid, health - grid.get(m).get(n), m, n + 1, visited, dp);

        visited[m][n] = 0;

        boolean result =  up || down || left || right;

        if(result){
            dp[m][n][health] = 1;
        }
        else{
            dp[m][n][health] = 0;
        }

        return result;
    }


    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        
        int[][] visited = new int[grid.size()][grid.get(0).size()];
        int[][][] dp = new int[grid.size()][grid.get(0).size()][health + 1];

        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(0).size(); j++){
                Arrays.fill(dp[i][j], -1);
            }
        }

        return safeWalk(grid, health, 0, 0, visited, dp);
    }
}
