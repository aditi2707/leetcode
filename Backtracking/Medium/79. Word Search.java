class Solution {

    public boolean findWord(char[][] board, String word, int ind, int i, int j, int[][] visited){

        if(ind == word.length()){
            return true;
        }

        if(i >= board.length || i < 0){
            return false;
        }
        if(j >= board[0].length || j < 0){
            return false;
        }
        if(visited[i][j] == 1){
            return false;
        }
        if(word.charAt(ind) != board[i][j]){
            return false;
        }

        visited[i][j] = 1;

        boolean result = findWord(board, word, ind+1, i+1, j, visited) || findWord(board, word, ind+1, i, j+1, visited) || findWord(board, word, ind+1, i-1, j, visited) || findWord(board, word, ind+1, i, j-1, visited);
        visited[i][j] = 0;

        return result;
    }

    public boolean exist(char[][] board, String word) {
        
        int[][] visited = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(findWord(board, word, 0, i, j, visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
