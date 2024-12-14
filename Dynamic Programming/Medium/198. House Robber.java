class Solution {

    public int loot(int i, int[] arr, int[] dp){
        
        if(i == 0){
            return arr[0];
        }
        if(i == 1){
            return Math.max(arr[0], arr[1]);
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        int pick = arr[i] + loot(i - 2, arr, dp);
        int notPick = loot(i - 1, arr, dp);
        
        dp[i] = Math.max(pick, notPick);
        return dp[i];
    }

    public int rob(int[] arr) {

        if(arr.length == 1){
            return arr[0];
        }
        if(arr.length == 2){
            return Math.max(arr[0], arr[1]);
        }
        
        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);
        
        for(int i = 2; i < arr.length; i++){
            int curr = Math.max(arr[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
        
        
        
        
        
        
        
        
        
        
        // if(arr.length == 1){
        //     return arr[0];
        // }
        // if(arr.length == 2){
        //     return Math.max(arr[0], arr[1]);
        // }
        
        // int[] dp = new int[arr.length];
        
        // dp[0] = arr[0];
        // dp[1] = Math.max(arr[0], arr[1]);
        
        // for(int i = 2; i < arr.length; i++){
        //     dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        // }
        
        // return dp[dp.length - 1];
        
        
        
        
        
        
        
        
        // int[] dp = new int[arr.length];
        
        // Arrays.fill(dp, -1);
        
        // return Math.max(loot(arr.length - 1, arr, dp), loot(arr.length - 2, 
        // arr, dp));
    }
}
