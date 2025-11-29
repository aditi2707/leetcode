class Solution {
    public int removeDuplicates(int[] nums) {

        // Time Complexity : O(n)
        // We are not swapping the values, just changing the index value. This way
        // the next iteration knows whether the changed element is still duplicate
        // or not!

        // Space Complexity : O(1)

        
        int p = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[p] = nums[i];
                p++;
            }
        }

        return p;
    }
}
