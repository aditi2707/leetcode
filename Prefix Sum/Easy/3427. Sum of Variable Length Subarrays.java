class Solution {
    public int subarraySum(int[] nums) {

        // Edge cases:
        // 1. if the start index = 0, then the prefix[i] will have the answer
        // 2. if start = i, then the prefix[i] will have the answer
        

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        int[] prefix = new int[nums.length];
        int sum = 0;
        prefix[0] = nums[0];


        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                prefix[i] = prefix[i - 1] + nums[i];
            }
            int start = Math.max(0, i - nums[i]);

            if(start == 0 || start == i){
                sum += prefix[i];
            }
            else{
                sum += prefix[i] - prefix[start - 1];
            }
        }

        return sum;






        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n)

        
        // int[] prefix = new int[nums.length];
        // int sum = 0;
        // prefix[0] = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] + nums[i];
        // }

        // for(int i = 0; i < nums.length; i++){
        //     int start = Math.max(0, i - nums[i]);

        //     if(start == 0 || start == i){
        //         sum += prefix[i];
        //     }
        //     else{
        //         sum += prefix[i] - prefix[start - 1];
        //     }
        // }

        // return sum;
    }
}
