class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if((r * c) != (mat.length * mat[0].length)){
            return mat;
        }

        int[][] ans = new int[r][c];
        int rows = 0, cols = 0;
        int flag = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = mat[rows][cols];
                cols++;

                if(cols == mat[0].length){
                    cols = 0;
                    rows++;
                    // if(rows == mat.length){
                    //     flag = 1;
                    //     break;
                    // }
                }
                
            }
            // if(flag == 1){
            //     break;
            // }
        }

        return ans;
    }
}
