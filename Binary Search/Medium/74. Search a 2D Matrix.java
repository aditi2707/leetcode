class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0, high = matrix.length * matrix[0].length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            int midElement = matrix[mid / matrix[0].length][mid % matrix[0].length];

            if(target == midElement){
                return true;
            }
            else if(target < midElement){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return false;


        
        // for(int i = 0; i < matrix.length; i++){
        //     if(target <= matrix[i][matrix[i].length-1]){

        //         int low = 0, high = matrix[i].length-1;
        //         while(low <= high){
        //             int mid = (low + high) / 2;
        //             if(matrix[i][mid] == target){
        //                 return true;
        //             }
        //             else if(matrix[i][mid] < target){
        //                 low = mid+1;
        //             }
        //             else{
        //                 high = mid-1;
        //             }
        //         }


        //         // for(int j = 0; j < matrix[i].length; j++){
        //         //     if(matrix[i][j] == target){
        //         //         return true;
        //         //     }
        //         // }

        //         return false;
        //     }
        // }

        // return false;
    }
}
