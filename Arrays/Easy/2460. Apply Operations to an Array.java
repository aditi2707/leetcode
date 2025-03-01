class Solution {
    public int[] applyOperations(int[] nums) {

        // Time Complexity : O(3n). The two for loops are running for array length.
        // The while loop can run for a maximum of array length. Hence TC = O(n).

        // Space Complexity : O(1).
        

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int nonZero = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        while(nonZero < nums.length){
            nums[nonZero] = 0;
            nonZero++;
        }

        return nums;




        // // Time Complexity : O(2n). The for loops are running for array length.

        // // Space Complexity : O(n). The result array is of same length as the
        // // original array.


        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i] == nums[i + 1]){
        //         nums[i] *= 2;
        //         nums[i + 1] = 0;
        //     }
        // }

        // int[] ans = new int[nums.length];
        // int k = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         ans[k] = nums[i];
        //         k++;
        //     }
        // }

        // return ans;
    }
}
