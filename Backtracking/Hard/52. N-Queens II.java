class Solution {

    Set<Integer> cols = new HashSet<>();
    Set<Integer> posDiag = new HashSet<>();
    Set<Integer> negDiag = new HashSet<>();

    private int backtracking(int n, int count, int row){

        if(count == n){
            return 1;
        }
        
        int res = 0;
        for(int i = 0; i < n; i++){
            if(cols.contains(i) || posDiag.contains(i + row) || 
            negDiag.contains(row - i)){
                continue;
            }

            cols.add(i);
            posDiag.add(i + row);
            negDiag.add(row - i);

            res += backtracking(n, count + 1, row + 1);

            cols.remove(i);
            posDiag.remove(i + row);
            negDiag.remove(row - i);
        }

        return res;
    }


    public int totalNQueens(int n) {

        // Time Complexity : O(n * n!).
        // If we consider the first row, there are n choices where we can keep the
        // queen. Then in the second row we have ~(n - 1) choices for the second row.
        // So, the TC can be roughly O(n!). This will be true for n choices, hence
        // TC will be n * n!.

        // Space Complexity : O(3 * n + n) (if we consider the recursion stack).
        // The three sets will take a space of n each and the height of the stack can
        // be a maximum of n.

        
        return backtracking(n, 0, 0);
    }
}
