class Solution {
    public void setZeroes(int[][] matrix) {

        // Time Complexity : O((m * 2) + (n * 2) + (m * n) ^ 2) 
        // (where m = rows, n = cols).

        // Space Complexity : O(1)
        
        
        boolean firstRow = false;
        boolean firstCol = false;

        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

        return;




        // // Time Complexity : O((m * n) ^ 3) (where m = rows, n = cols)

        // // Space Complexity : O(m + n) (where m = rows, n = cols)

        
        // Set<Integer> rows = new HashSet<>();
        // Set<Integer> cols = new HashSet<>();

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(matrix[i][j] == 0){
        //             rows.add(i);
        //             cols.add(j);
        //         }
        //     }
        // }

        // for(Integer i: rows){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         matrix[i][j] = 0;
        //     }
        // }
        // for(Integer j: cols){
        //     for(int i = 0; i < matrix.length; i++){
        //         matrix[i][j] = 0;
        //     }
        // }

        // return;
    }
}
