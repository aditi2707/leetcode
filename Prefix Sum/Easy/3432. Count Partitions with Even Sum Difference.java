class Solution {
    public int countPartitions(int[] nums) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        
        
        int[] left = new int[nums.length];
        int right = 0;
        int count = 0;

        left[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] + nums[i];
        }

        for(int i = nums.length - 2; i >= 0; i--){

            right += nums[i + 1];
            if((left[i] - right) % 2 == 0){
                count++;
            }
        }

        return count;






        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)

        
        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];
        // int count = 0;

        // left[0] = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     left[i] = left[i - 1] + nums[i];
        // }

        // for(int i = nums.length - 2; i >= 0; i--){
        //     right[i] = right[i + 1] + nums[i + 1];
        //     if((left[i] - right[i]) % 2 == 0){
        //         count++;
        //     }
        // }

        // return count;
    }
}
