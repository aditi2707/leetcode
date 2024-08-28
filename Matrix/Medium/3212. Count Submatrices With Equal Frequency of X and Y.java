class Solution {
    public int numberOfSubmatrices(char[][] grid) {

        int[][] x = new int[grid.length+1][grid[0].length+1];
        int[][] y = new int[grid.length+1][grid[0].length+1];
        int counter = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == 'X'){
                    x[i+1][j+1] = x[i][j+1] + x[i+1][j] - x[i][j] + 1;
                    y[i+1][j+1] = y[i][j+1] + y[i+1][j] - y[i][j];
                }
                else if(grid[i][j] == 'Y'){
                    x[i+1][j+1] = x[i][j+1] + x[i+1][j] - x[i][j];
                    y[i+1][j+1] = y[i][j+1] + y[i+1][j] - y[i][j] + 1;
                }
                else{
                    x[i+1][j+1] = x[i][j+1] + x[i+1][j] - x[i][j];
                    y[i+1][j+1] = y[i][j+1] + y[i+1][j] - y[i][j];
                }
                
            }
        }

        for(int i = 1; i <= grid.length; i++){
            for(int j = 1; j <= grid[0].length; j++){
                if(x[i][j] > 0 && x[i][j] == y[i][j]){
                    counter++;
                }
            }
        }

        return counter;




        // int[] x = new int[grid[0].length];
        // int[] y = new int[grid[0].length];
        // int counter = 0;

        // for(int i = 0; i < grid.length; i++){
        //     int countX = 0, countY = 0;
        //     for(int j = 0; j < grid[0].length; j++){
        //         if(grid[i][j] == 'X'){
        //             countX++;
        //         }
        //         else if(grid[i][j] == 'Y'){
        //             countY++;
        //         }

        //         x[j] += countX;
        //         y[j] += countY;

        //         if(x[j] != 0 && x[j] == y[j]){
        //             counter++;
        //         }
        //     }
        // }

        // return counter;
    }
}
