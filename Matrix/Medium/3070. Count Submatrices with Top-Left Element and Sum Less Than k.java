class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        
        int[][] prefix = new int[grid.length+1][grid[0].length+1];
        int counter = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                prefix[i+1][j+1] = prefix[i][j+1] + prefix[i+1][j] - prefix[i][j] + grid[i][j];
                if(prefix[i+1][j+1] <= k){
                    counter++;
                }
            }
        }

        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[0].length; j++){
        //         if(prefix[i+1][j+1] <= k){
        //             counter++;
        //         }
        //     }
        // }

        return counter;
    }
}
