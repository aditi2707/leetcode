class Solution {

    private void dfs(char[][] board, int i, int j, int[][] visited, boolean isRow){

        if(i < 0 || i >= board.length){
            return;
        }
        if(j < 0 || j >= board[0].length){
            return;
        }
        if(board[i][j] == '.' || visited[i][j] == 1){
            return;
        }

        visited[i][j] = 1;

        if(isRow){
            dfs(board, i + 1, j, visited, true);
        }
        else{
            dfs(board, i, j + 1, visited, false);
        }
    }



    private void dfs(char[][] board, int i, int j, int[][] visited){

        if(i < 0 || i >= board.length){
            return;
        }
        if(j < 0 || j >= board[0].length){
            return;
        }
        if(board[i][j] == '.' || visited[i][j] == 1){
            return;
        }

        visited[i][j] = 1;

        dfs(board, i + 1, j, visited);
        dfs(board, i - 1, j, visited);
        dfs(board, i, j + 1, visited);
        dfs(board, i, j - 1, visited);
    }


    public int countBattleships(char[][] board) {

        // Time Complexity : O(m * n)

        // Space Complexity : O(1)


        int count = 0;
        int[][] visited = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X'){
                    if(i - 1 >= 0 && board[i - 1][j] == 'X' || j - 1 >= 0 && board[i][j - 1] == 'X'){
                        continue;
                    }
                    count++;
                }
            }
        }

        return count;





        // // Time Complexity : O(m * n)

        // // Space Complexity : O((m * n) + (m + n))


        // int count = 0;
        // int[][] visited = new int[board.length][board[0].length];

        // for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j < board[0].length; j++){
        //         if(board[i][j] == 'X' && visited[i][j] == 0){
        //             if(i + 1 < board.length && board[i + 1][j] == 'X'){
        //                 count++;
        //                 dfs(board, i, j, visited, true);
        //             }
        //             else if(j + 1 < board[0].length && board[i][j + 1] == 'X'){
        //                 count++;
        //                 dfs(board, i, j, visited, false);
        //             }
        //             else{
        //                 count++;
        //             }
        //         }
        //     }
        // }

        // return count;





        // // Time Complexity : O(m * n)

        // // Space Complexity : O((m * n) * 2)

        
        // int count = 0;
        // int[][] visited = new int[board.length][board[0].length];

        // for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j < board[0].length; j++){
        //         if(board[i][j] == 'X' && visited[i][j] == 0){
        //             count++;
        //             dfs(board, i, j, visited);
        //         }
        //     }
        // }

        // return count;
    }
}
