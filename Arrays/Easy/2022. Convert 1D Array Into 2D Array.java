class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] ans = new int[m][n];
        int k = 0;

        if(m*n != original.length){
            return new int[0][0];
        }

        int col = 0;
        int row = 0;

        while(row < m){
            ans[row][col] = original[k];
            col++;
            k++;

            if(col == n){
                row++;
                col = 0;
            }
        }

        return ans;
    }
}
