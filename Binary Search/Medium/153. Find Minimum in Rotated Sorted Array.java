class Solution {
    public int findMin(int[] nums) {

        // Time Complexity : O(log n)
        // Typical binary search algorithm

        // Space Complexity : O(1)

        
        int low = 0, high = nums.length - 1;
        int min = nums[0];

        while(low <= high){
            int mid = low + (high - low) / 2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return min;
    }
}
