class Solution {

    PriorityQueue<Integer> pQ = new PriorityQueue<>();

    public void addDiagonal(int[][] mat, int i, int j){

        if(i >= mat.length || j >= mat[0].length){
            return;
        }

        pQ.add(mat[i][j]);
        addDiagonal(mat, i+1, j+1);
    }

    public void sortDiagonal(int[][] mat, int[][] visited, int i, int j){

        if(i >= mat.length || j >= mat[0].length){
            return;
        }

        mat[i][j] = pQ.poll();
        visited[i][j] = 1;

        sortDiagonal(mat, visited, i+1, j+1);
    }

    public int[][] diagonalSort(int[][] mat) {

        int[][] visited = new int[mat.length][mat[0].length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(visited[i][j] != 1){
                    addDiagonal(mat, i, j);
                    sortDiagonal(mat, visited, i, j);
                }
            }
        }

        return mat;









        
        
        // int rows = 0;
        // int cols = 0;

        // while(rows < mat.length){

        //     int r = rows;
        //     int c = cols;

        //     List<Integer> arr = new ArrayList<>();
        //     while(r < mat.length && c < mat[0].length){
        //         arr.add(mat[r][c]);
        //         r++;
        //         c++;
        //     }

        //     Collections.sort(arr);
        //     r = rows; c = cols;
        //     int k = 0;
        //     while(r < mat.length && c < mat[0].length){
        //         mat[r][c] = arr.get(k);
        //         r++;
        //         c++;
        //         k++;
        //     }

        //     cols++;

        //     if(cols > mat[0].length){
        //         rows++;
        //         cols = 0;
        //     }
        // }

        // return mat;
    }
}
