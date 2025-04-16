class Solution {
    public int search(int[] nums, int target) {

        // Time Complexity : O(log n)
        // In every iteration, the length of the array is decreasing by half.

        // Space Complexity : O(1)

        
        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
