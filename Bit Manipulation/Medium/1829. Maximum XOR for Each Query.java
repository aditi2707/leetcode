class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        
        
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int[] ans = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] ^ nums[i];
        }

        int mask = (1 << maximumBit) - 1;

        for(int i = nums.length - 1; i >= 0; i--){
            ans[ans.length - 1 - i] = mask ^ prefix[i];
        }

        return ans;







        // // Time Complexity : O(n * 2 + (2 ^ maximumBit))

        // // Space Complexity : O(n)

        
        // int[] prefix = new int[nums.length];
        // prefix[0] = nums[0];
        // int[] ans = new int[nums.length];

        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] ^ nums[i];
        // }

        // int max = prefix[prefix.length - 1];
        // int k = 0;
        // int check = max;
        
        // for(int i = (int)Math.pow(2, maximumBit) - 1; i >= 0; i--){
        //     if((check ^ i) > max){
        //         max = check ^ i;
        //         k = i;
        //     }
        // }

        // int maximize = k ^ prefix[prefix.length - 1];

        // for(int i = nums.length - 1; i >= 0; i--){
        //     ans[ans.length - 1 - i] = maximize ^ prefix[i];
        // }

        // return ans;
    }
}
