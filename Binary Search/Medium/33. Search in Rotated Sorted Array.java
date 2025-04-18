class Solution {
    public int search(int[] nums, int target) {

        // Time Complexity : O(log n)
        // This is a basic binary search code which takes O(log n) time.

        // Space Complexity : O(1)
        
        
        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= nums[low]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid + 1;
                }
                else{
                    high= mid - 1;
                }
            }
        }

        return -1;
    }
}
