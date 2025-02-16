class Solution {

    private boolean backtracking(char[][] board, String word, int ind, 
    int m, int n, int[][] visited){

        if(ind == word.length()){
            return true;
        }

        if(m < 0 || m >= board.length){
            return false;
        }

        if(n < 0 || n >= board[0].length){
            return false;
        }

        if(visited[m][n] == 1 || board[m][n] != word.charAt(ind)){
            return false;
        }

        visited[m][n] = 1;

        boolean up = backtracking(board, word, ind + 1, m - 1, n, visited);
        boolean down = backtracking(board, word, ind + 1, m + 1, n, visited);
        boolean left = backtracking(board, word, ind + 1, m, n - 1, visited);
        boolean right = backtracking(board, word, ind + 1, m, n + 1, visited);

        visited[m][n] = 0;

        return up || down || left || right;
    }


    public boolean exist(char[][] board, String word) {

        // Time Complexity : O(m * n * (4 ^ word_length)), where m = length of row 
        // and n = length of col of board. 
        // The for loop will run for every character in board, so that will be 
        // m * n. In the backtracking(), for every choice, we have 4 directions. 
        // And those 4 directions can only be chosen if the character is present in
        // word, so the function will run for a max of length of word, but since 
        // each character has 4 choices, then TC becomes 4 ^ word_length.

        // Space Complexity : O(m * n), for the visited[][].
        
        
        int[][] visited = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(backtracking(board, word, 0, i, j, visited)){
                    return true;
                }
            }
        }

        return false;
    }
}
