class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int counter = 0;

        int firstRow = 0;
        int lastRow = matrix.length - 1;
        int firstCol = 0;
        int lastCol = matrix[0].length - 1;

        while(counter < matrix.length * matrix[0].length){

            for(int c = firstCol; c <= lastCol; c++){
                ans.add(matrix[firstRow][c]);
                counter++;
            }

            if(counter >= matrix.length * matrix[0].length){
                break;
            }

            for(int r = firstRow + 1; r <= lastRow; r++){
                ans.add(matrix[r][lastCol]);
                counter++;
            }

            if(counter >= matrix.length * matrix[0].length){
                break;
            }

            // if(firstRow < lastRow){
                for(int c = lastCol - 1; c >= firstCol; c--){
                    ans.add(matrix[lastRow][c]);
                    counter++;
                }
            // }

            if(counter >= matrix.length * matrix[0].length){
                break;
            }
            
            // if(firstCol < lastCol){
                for(int r = lastRow - 1; r > firstRow; r--){
                    ans.add(matrix[r][firstCol]);
                    counter++;
                }
            // }

            if(counter >= matrix.length * matrix[0].length){
                break;
            }
            
            firstRow++;
            lastRow--;
            firstCol++;
            lastCol--;
        }

        return ans;
    }
}
