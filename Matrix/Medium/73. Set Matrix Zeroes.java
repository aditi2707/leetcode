class Solution {
    public void setZeroes(int[][] matrix) {

        int start = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        start = 0;
                    }
                    else{
                        matrix[i][0] = 0;
                    }
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(start == 0){
            Arrays.fill(matrix[0], 0);
        }

        return;








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

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(rows.contains(i)){
        //             matrix[i][j] = 0;
        //         }
        //         if(cols.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // return;
    }
}
