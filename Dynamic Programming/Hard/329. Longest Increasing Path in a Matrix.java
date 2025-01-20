class Solution {

    private int lip(int[][] matrix, int m, int n, int[][] visited, int[][] dp){

        if(m < 0 || m >= matrix.length){
            return 0;
        }
        if(n < 0 || n >= matrix[0].length){
            return 0;
        }
        if(visited[m][n] == 1){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        visited[m][n] = 1;
        int up = 0, down = 0, right = 0, left = 0;

        if(m - 1 >= 0 && matrix[m - 1][n] > matrix[m][n]){
            up = 1 + lip(matrix, m - 1, n, visited, dp);
        }
        if(m + 1 < matrix.length && matrix[m + 1][n] > matrix[m][n]){
            down = 1 + lip(matrix, m + 1, n, visited, dp);
        }
        if(n + 1 < matrix[0].length && matrix[m][n + 1] > matrix[m][n]){
            right = 1 + lip(matrix, m, n + 1, visited, dp);
        }
        if(n - 1 >= 0 && matrix[m][n - 1] > matrix[m][n]){
            left = 1 + lip(matrix, m, n - 1, visited, dp);
        }

        visited[m][n] = 0;

        return dp[m][n] = Math.max(up, Math.max(down, Math.max(right, left)));
    }


    public int longestIncreasingPath(int[][] matrix) {
        
        int[][] visited = new int[matrix.length][matrix[0].length];
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;

        for(int i = 0; i < matrix.length; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                max = Math.max(max, lip(matrix, i, j, visited, dp));
            }
        }

        return max + 1;
    }
}
