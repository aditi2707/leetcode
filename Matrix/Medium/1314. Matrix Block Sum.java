class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int[][] answer = new int[mat.length+1][mat[0].length+1];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                answer[i+1][j+1] = answer[i][j+1] + answer[i+1][j] - answer[i][j] + mat[i][j];
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){

                int lowerR = Math.max(0, i-k) + 1;
                int upperR = Math.min(mat.length, i+k+1);
                int lowerC = Math.max(0, j-k) + 1;
                int upperC = Math.min(mat[0].length, j+k+1);

                mat[i][j] = answer[upperR][upperC] - answer[upperR][lowerC-1] - answer[lowerR-1][upperC] + answer[lowerR-1][lowerC-1];
            }
        }

        return mat;






        
        // int[][] answer = new int[mat.length+1][mat[0].length+1];

        // for(int i = 0; i < mat.length; i++){
        //     for(int j = 0; j < mat[i].length; j++){
                
        //         int lowerR = i-k;
        //         int upperR = i+k;
        //         int lowerC = j-k;
        //         int upperC = j+k;
        //         int sum = 0;

        //         if(lowerR < 0){
        //             lowerR = 0;
        //         }
        //         if(lowerC < 0){
        //             lowerC = 0;
        //         }
        //         if(upperR >= mat.length){
        //             upperR = mat.length-1;
        //         }
        //         if(upperC >= mat[0].length){
        //             upperC = mat[0].length-1;
        //         }


        //         for(int m = lowerR; m <= upperR; m++){
        //             for(int n = lowerC; n <= upperC; n++){
        //                 sum += mat[m][n];
        //             }
        //             answer[i][j] = sum;
        //         }
        //     }
        // }

        // return answer;
    }
}
