class Solution {

    Set<Integer> cols = new HashSet<>();
    Set<Integer> posDiag = new HashSet<>();
    Set<Integer> negDiag = new HashSet<>();

    public void backtracking(int k, List<List<String>> ans, char[][] temp, int m){

        if(m == k){
            List<String> t = new ArrayList<>();
            for(int i = 0; i < k; i++){
                String str = new String(temp[i]);
                t.add(str);
            }
            ans.add(t);
            return;
        }

        for(int c = 0; c < k; c++){
            if(cols.contains(c) || posDiag.contains(m + c) || negDiag.contains(m - c)){
                continue;
            }

            cols.add(c);
            posDiag.add(m + c);
            negDiag.add(m - c);

            temp[m][c] = 'Q';

            backtracking(k, ans, temp, m + 1);

            cols.remove(c);
            posDiag.remove(m + c);
            negDiag.remove(m - c);

            temp[m][c] = '.';
        }
    }


    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        
        char[][] temp = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(temp[i], '.');
        }
        
        backtracking(n, ans, temp, 0);

        return ans;
    }
}
