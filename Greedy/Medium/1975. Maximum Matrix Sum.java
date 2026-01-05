class Solution {
    public long maxMatrixSum(int[][] matrix) {

        // Time Complexity : O(n * n)

        // Space Complexity : O(1)
        
        
        long sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, count = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    count++;
                }
                min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }

        if(count % 2 == 0){
            return sum;
        }

        return sum - 2 * (min);
    }
}
