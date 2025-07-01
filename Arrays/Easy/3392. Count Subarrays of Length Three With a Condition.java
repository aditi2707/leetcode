class Solution {
    public int countSubarrays(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int count = 0;

        for(int i = 0; i < nums.length - 2; i++){
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];

            if((a + c) * 2 == b){
                count++;
            }
        }

        return count;
    }
}
