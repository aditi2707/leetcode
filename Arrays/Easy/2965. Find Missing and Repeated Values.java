class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] freq = new int[grid.length * grid.length + 1];
        int[] ans = new int[2];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                freq[grid[i][j]] += 1;
            }
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                ans[0] = i;
            }
            if(freq[i] == 0){
                ans[1] = i;
            }

            if(ans[0] != 0 && ans[1] != 0){
                return ans;
            }
        }

        return ans;







        // HashMap<Integer, Integer> counter = new HashMap<>();
        // int[] ans = new int[2];
        // int n = grid.length;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < grid[i].length; j++){
        //         if(!counter.containsKey(grid[i][j])){
        //             counter.put(grid[i][j], 1);
        //         }
        //         else{
        //             counter.put(grid[i][j], 2);
        //             ans[0] = grid[i][j];
        //         }
        //     }
        // }

        // for(int i = 1; i <= n*n; i++){
        //     if(!counter.containsKey(i)){
        //         ans[1] = i;
        //         break;
        //     }
        // }

        // return ans;
    }
}
