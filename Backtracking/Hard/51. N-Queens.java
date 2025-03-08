class Solution {

    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> posDiag = new HashSet<>();
    private Set<Integer> negDiag = new HashSet<>();

    private void backtracking(List<List<String>> ans, char[][] board, int m, int n){

        if(m == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                String str = new String(board[i]);
                temp.add(str);
            }
            ans.add(temp);
            return;
        }

        for(int j = 0; j < n; j++){
            if(cols.contains(j) || posDiag.contains(m - j) || 
            negDiag.contains(m + j)){
                continue;
            }

            cols.add(j);
            posDiag.add(m - j);
            negDiag.add(m + j);

            board[m][j] = 'Q';

            backtracking(ans, board, m + 1, n);

            cols.remove(j);
            posDiag.remove(m - j);
            negDiag.remove(m + j);

            board[m][j] = '.';
        }

        return;
    }

    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        backtracking(ans, board, 0, n);

        return ans;
    }
}
