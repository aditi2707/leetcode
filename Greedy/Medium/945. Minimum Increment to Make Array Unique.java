class Solution {
    public int minIncrementForUnique(int[] nums) {

        // Time Complexity : O(nlog n + n)

        // Space Complexity : O(1)

        
        int prev = 0;
        int count = 0;

        Arrays.sort(nums);

        prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= prev){
                prev = prev + 1;
                count += (prev - nums[i]);
            }
            else{
                prev = nums[i];
            }
        }

        return count;
    }
}
