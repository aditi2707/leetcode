class Solution {

    private int hoppingScore(int[] nums, int index, int[] dp){

        if(index <= 0){
            return 0;
        }

        if(dp[index] != 0){
            return dp[index];
        }

        int res = 0;

        for(int i = 0; i < index; i++){
            res = Math.max(res, (index - i) * nums[index] + hoppingScore(nums, i, dp));
        }

        return dp[index] = res;
    }

    
    public int maxScore(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        

        int max = 0, ans = 0;

        for(int i = nums.length-1; i > 0; i--){
            max = Math.max(max, nums[i]);
            ans += max;
        }

        return ans;




        
        // int[] dp = new int[nums.length];

        // for(int i = 1; i < nums.length; i++){
        //     for(int j = 0; j < i; j++){
        //         dp[i] = Math.max(dp[i], dp[j]+(i-j)*nums[i]);
        //     }
        // }

        // return dp[nums.length-1];



        

        // // Time Complexity : O(n * n)

        // // Space Complexity : O(n + n)


        // int[] dp = new int[nums.length];
        
        // return hoppingScore(nums, nums.length - 1, dp);
    }
}
