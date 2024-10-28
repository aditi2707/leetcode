class Solution {
    public void rotate(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

        return;









        // int left = 0, right = matrix.length - 1;

        // while(left < right){

        //     for(int i = 0; i < right - left; i++){
        //         int top = left, bottom = right;
        //         int temp = matrix[top][left + i];
        //         matrix[top][left + i] = matrix[bottom - i][left];
        //         matrix[bottom - i][left] = matrix[bottom][right - i];
        //         matrix[bottom][right - i] = matrix[top + i][right];
        //         matrix[top + i][right] = temp;
        //     }

        //     left++;
        //     right--;
        // }

    }
}
