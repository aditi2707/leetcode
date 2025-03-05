class Solution {
    public long coloredCells(int n) {
        
        // Time Complexity : O(n - 1).

        // Space Complexity : O(1).

        
        long ans = 1;
        long addCells = 4;

        while(n - 1 > 0){
            ans += addCells;
            addCells += 4;
            n--;
        }

        return ans;
    }
}
