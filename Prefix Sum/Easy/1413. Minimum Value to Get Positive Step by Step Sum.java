class Solution {
    public int minStartValue(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int prefix = 0;
        int min = nums[0];

        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            min = Math.min(min, prefix);
        }

        return min < 0? Math.abs(min) + 1 : 1;







        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        
        // int[] prefix = new int[nums.length];
        // int min = nums[0];
        // prefix[0] = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] + nums[i];
        //     min = Math.min(min, prefix[i]);
        // }

        // return min < 0? Math.abs(min) + 1 : 1;
    }
}
