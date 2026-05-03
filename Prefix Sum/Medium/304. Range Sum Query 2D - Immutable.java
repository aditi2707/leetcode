class NumMatrix {

    int[][] matrix;
    int[][] prefix;

    public NumMatrix(int[][] matrix) {

        // Time Complexity : O(m * n)
        // Space Complexity : O(m * n)
        
        
        this.matrix = matrix;
        prefix = new int[matrix.length + 2][matrix[0].length + 2];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                prefix[i + 1][j + 1] = prefix[i + 1][j] + prefix[i][j + 1] - 
                prefix[i][j] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        // Time Complexity : O(m * n)
        
        return prefix[row2 + 1][col2 + 1] - prefix[row2 + 1][col1] - 
        (prefix[row1][col2 + 1] - prefix[row1][col1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */











// class NumMatrix {

//     int[][] matrix;
//     int[][] prefix;

//     public NumMatrix(int[][] matrix) {
        
//         this.matrix = matrix;
//         prefix = new int[matrix.length][matrix[0].length];

//         prefix[0][0] = matrix[0][0];

//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[0].length; j++){
//                 if(i == 0 && j == 0){
//                     continue;
//                 }
//                 if(i == 0){
//                     prefix[0][j] = prefix[0][j - 1] + matrix[0][j];
//                     continue;
//                 }
//                 if(j == 0){
//                     prefix[i][0] = prefix[i - 1][0] + matrix[i][0];
//                     continue;
//                 }
//                 prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - 
//                 prefix[i - 1][j - 1] + matrix[i][j];
//             }
//         }
//     }
    
//     public int sumRegion(int row1, int col1, int row2, int col2) {

//         if(row1 == 0 && col1 == 0){
//             return prefix[row2][col2];
//         }

//         if(row1 == 0){
//             return prefix[row2][col2] - (prefix[row2][col1 - 1]);
//         }
//         if(col1 == 0){
//             return prefix[row2][col2] - (prefix[row1 - 1][col2]);
//         }
        
//         return prefix[row2][col2] - prefix[row2][col1 - 1] - 
//         (prefix[row1 - 1][col2] - prefix[row1 - 1][col1 - 1]);
//     }
// }


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
