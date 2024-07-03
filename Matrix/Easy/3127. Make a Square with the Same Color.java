class Solution {

    public boolean checkSquare(char[][] grid, int row, int col){

        int bCount = 0;
        int wCount = 0;

        char[] square = {grid[row][col], grid[row][col+1], grid[row+1][col], grid[row+1][col+1]};

        for(int i = 0; i < square.length; i++){
            if(square[i] == 'B'){
                bCount++;
            }
            else{
                wCount++;
            }
        }

        // for(int i = row; i <= row+1; i++){
        //     for(int j = col; j <= col+1; j++){
        //         if(grid[i][j] == 'B'){
        //             bCount++;
        //         }
        //         else{
        //             wCount++;
        //         }
        //     }
        // }

        if(bCount >= 3 || wCount >= 3){
            return true;
        }
        return false;
    }
    public boolean canMakeSquare(char[][] grid) {
        
        boolean square1 = checkSquare(grid, 0, 0);
        boolean square2 = checkSquare(grid, 0, 1);
        boolean square3 = checkSquare(grid, 1, 0);
        boolean square4 = checkSquare(grid, 1, 1);

        if(square1 || square2 || square3 || square4){
            return true;
        }
        return false;
    }
}
