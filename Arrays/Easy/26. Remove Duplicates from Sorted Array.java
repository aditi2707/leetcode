class Solution {
    public int removeDuplicates(int[] nums) {

        // Time Complexity : O(n)

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
