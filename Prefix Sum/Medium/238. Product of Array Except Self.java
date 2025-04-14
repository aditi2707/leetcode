class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Time Complexity : O(n * 2)
        // First loop will find the product of numbers on the left of that number.
        // The suffix variable will carry the intermediate suffix and so will be 
        // multiplied with that intermediate prefix and updated accordingly.

        // Space Complexity : O(n)
        // The array will store the prefix and the answer in the end.


        int[] prefix = new int[nums.length];
        int suffix = 1;

        prefix[0] = 1;

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            suffix = suffix * nums[i + 1];
            prefix[i] = prefix[i] * suffix;
        }

        return prefix;





        // // Time Complexity : O(n * 3)
        // // First loop will find the product of numbers on the left of that number.
        // // Second loop will find the product of numbers on the right of that number.
        // // Third loop will product both sides for a particular number.

        // // Space Complexity : O(n * 2)
        // // One will store the prefix and the other suffix.

        
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];

        // prefix[0] = 1;
        // suffix[nums.length - 1] = 1;

        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] * nums[i - 1];
        // }
        // for(int i = nums.length - 2; i >= 0; i--){
        //     suffix[i] = suffix[i + 1] * nums[i + 1];
        // }

        // for(int i = 0; i < suffix.length; i++){
        //     prefix[i] *= suffix[i];
        // }

        // return prefix;
    }
}
