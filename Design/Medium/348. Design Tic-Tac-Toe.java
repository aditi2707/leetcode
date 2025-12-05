class TicTacToe {

    int[][] board;
    int n;

    public TicTacToe(int n) {
        board = new int[n + 2][n + 2];
        this.n = n;
    }
    
    public int move(int row, int col, int player) {

        // Could have even used two arrays, row and column
        // If player is 1, the count will increase by 1 otherwise decrease by 1
        // The winning condition will only be when the value is either -n or n


        // Time Complexity : O(1)
        // Space Complexity : O((n + 2) * 2)


        board[row + 1][col + 1] = player;

        if(player == 1){
            board[row + 1][0] += 1;
            board[0][col + 1] += 1;

            if(row + 1 == col + 1){
                board[0][0] += 1;
            }
            if(row + col == n - 1){
                board[0][board.length - 1] += 1;
            }

            if(board[row + 1][0] == n || 
            board[0][col + 1] == n ||
            board[0][board.length - 1] == n ||
            board[0][0] == n){
                return 1;
            }
            
        }
        else if(player == 2){
            board[row + 1][board.length - 1] += 1;
            board[board.length - 1][col + 1] += 1;

            if(row + 1 == col + 1){
                board[board.length - 1][board.length - 1] += 1;
            }
            if(row + col == n - 1){
                board[board.length - 1][0] += 1;
            }

            if(board[row + 1][board.length - 1] == n ||
            board[board.length - 1][col + 1] == n || 
            board[board.length - 1][board.length - 1] == n || 
            board[board.length - 1][0] == n){
                return 2;
            }
        }

        return 0;



        // // Time Complexity: O((n * n))

        // // Space Complexity : O(n * n)
        

        // board[row][col] = player;

        // for(int i = 0; i < n; i++){
        //     int player1 = 0, player2 = 0;
        //     for(int j = 0; j < n; j++){
        //         if(board[i][j] == 1){
        //             player1++;
        //         }
        //         else if(board[i][j] == 2){
        //             player2++;
        //         }
        //     }
        //     if(player1 == n){
        //         return 1;
        //     }
        //     if(player2 == n){
        //         return 2;
        //     } 
        // }

        

        // for(int i = 0; i < n; i++){
        //     int player1 = 0, player2 = 0;
        //     for(int j = 0; j < n; j++){
        //         if(board[j][i] == 1){
        //             player1++;
        //         }
        //         else if(board[j][i] == 2){
        //             player2++;
        //         }
        //     }
        //     if(player1 == n){
        //         return 1;
        //     }
        //     if(player2 == n){
        //         return 2;
        //     } 
        // }

        // int player1 = 0, player2 = 0;

        // for(int i = 0; i < n; i++){
            
        //     if(board[i][i] == 1){
        //         player1++;
        //     }
        //     else if(board[i][i] == 2){
        //             player2++;
        //         }
        // }

        // if(player1 == n){
        //     return 1;
        // }
        // if(player2 == n){
        //     return 2;
        // } 

        // player1 = 0; player2 = 0;

        // for(int i = 0; i < n; i++){
            
        //     if(board[i][n - 1 - i] == 1){
        //         player1++;
        //     }
        //     else if(board[i][n - 1 - i] == 2){
        //             player2++;
        //         }
        // }

        // if(player1 == n){
        //     return 1;
        // }
        // if(player2 == n){
        //     return 2;
        // } 


        // return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
