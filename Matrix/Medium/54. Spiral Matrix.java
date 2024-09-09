class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int firstRow = 0, lastRow = matrix.length-1;
        int firstColumn = 0, lastColumn = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        // int r = 0, c = 0;

        while(ans.size() < m*n){

            for(int c = firstColumn; c <= lastColumn; c++){
                ans.add(matrix[firstRow][c]);
            }
            for(int r = firstRow+1; r <= lastRow; r++){
                ans.add(matrix[r][lastColumn]);
            }
            if(firstRow < lastRow){
                for(int c = lastColumn-1; c >= firstColumn; c--){
                    ans.add(matrix[lastRow][c]);
                }
            }
            if(firstColumn < lastColumn){
                for(int r = lastRow-1; r >= firstRow+1; r--){
                    ans.add(matrix[r][firstColumn]);
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
