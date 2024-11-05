class Solution {

    public void dfs(char[][] board, int i, int j){
        if(i < 0 || i >= board.length){
            return;
        }
        if(j < 0 || j >= board[0].length){
            return;
        }
        if(board[i][j] != 'O'){
            return;
        }

        board[i][j] = 'T';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }


    public void solve(char[][] board) {
        
        for(int j = 0; j < board[0].length; j++){
            if(board[0][j] == 'O'){
                dfs(board, 0, j);
            }
            if(board[board.length - 1][j] == 'O'){
                dfs(board, board.length - 1, j);
            }
        }

        for(int j = 0; j < board.length; j++){
            if(board[j][0] == 'O'){
                dfs(board, j, 0);
            }
            if(board[j][board[0].length - 1] == 'O'){
                dfs(board, j, board[0].length - 1);
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }

        return;
    }
}
