class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];
        int firstRow = 0;
        int lastRow = n-1;
        int firstColumn = 0;
        int lastColumn = n-1;

        int counter = 1;

        while(counter <= n*n){

            for(int c = firstColumn; c <= lastColumn; c++){
                ans[firstRow][c] = counter;
                counter++;
            }
            for(int r = firstRow+1; r <= lastRow; r++){
                ans[r][lastColumn] = counter;
                counter++;
            }

            if(firstRow < lastRow){
                for(int c = lastColumn-1; c >= firstColumn; c--){
                    ans[lastRow][c] = counter;
                    counter++;
                }
            }
            if(firstColumn < lastColumn){
                for(int r = lastRow-1; r >= firstRow+1; r--){
                    ans[r][firstColumn] = counter;
                    counter++;
                }
            }

            firstRow++;
            lastRow--;
            firstColumn++;
            lastColumn--;
        }

        return ans;
    }
}
