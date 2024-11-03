class Solution {
    public boolean checkValid(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();

            for(int j = 0; j < matrix.length; j++){
                rows.add(matrix[i][j]);
                cols.add(matrix[j][i]);
            }

            if(rows.size() != matrix.length){
                return false;
            }
            if(cols.size() != matrix.length){
                return false;
            }
        }

        return true;
    }
}
