class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int maxCounter = 0;
        int[] ans = new int[2];

        for(int i = 0; i < mat.length; i++){
            int max = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    max++;
                }
            }
            if(max > maxCounter){
                maxCounter = max;
                ans[0] = i;
                ans[1] = maxCounter;
            }
        }

        return ans;
    }
}
