class Solution {

    public int returnCount(int[][] board, int i, int j){

        int count = 0;
        if(i + 1 < board.length && (board[i + 1][j] == 1 || board[i + 1][j] == -1)){
            count++;
        }
        if(i - 1 >= 0 && (board[i - 1][j] == 1 || board[i - 1][j] == -1)){
            count++;
        }
        if(j + 1 < board[0].length && (board[i][j + 1] == 1 || board[i][j + 1] == -1)){
            count++;
        }
        if(j - 1 >= 0 && (board[i][j - 1] == 1 || board[i][j - 1] == -1)){
            count++;
        }
        if(i + 1 < board.length && j + 1 < board[0].length && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == -1)){
            count++;
        }
        if(i + 1 < board.length && j - 1 >= 0 && (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == -1)){
            count++;
        }
        if(i - 1 >= 0 && j + 1 < board[0].length && (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == -1)){
            count++;
        }
        if(i - 1 >= 0 && j - 1 >= 0 && (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == -1)){
            count++;
        }

        return count;
    }


    public void gameOfLife(int[][] board) {

        // Time Complexity : O((m * n) * 2)

        // Space Complexity : O(1)

        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    int count = returnCount(board, i, j);

                    if(count < 2){
                        board[i][j] = -1;
                    }
                    if(count > 3){
                        board[i][j] = -1;
                    }
                }
                else{
                    int count = returnCount(board, i, j);
                    if(count == 3){
                        board[i][j] = 2;
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == -1){
                    board[i][j] = 0;
                }
                if(board[i][j] == 2){
                    board[i][j] = 1;
                }
            }
        }

        return;








        // // Time Complexity : O((m * n) * 2)

        // // Space Complexity : O(m * n)


        // int[][] temp = new int[board.length][board[0].length];
        
        // for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j < board[0].length; j++){
        //         if(board[i][j] == 1){
                    
        //             int count = returnCount(board, i, j);

        //             if(count < 2){
        //                 temp[i][j] = 0;
        //             }
        //             if(count > 3){
        //                 temp[i][j] = 0;
        //             }
        //             if(count == 2 || count == 3){
        //                 temp[i][j] = 1;
        //             }
        //         }
        //         else{
        //             int count = returnCount(board, i, j);
        //             if(count == 3){
        //                 temp[i][j] = 1;
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j < board[0].length; j++){
        //         board[i][j] = temp[i][j];
        //     }
        // }

        // return;
    }
}
