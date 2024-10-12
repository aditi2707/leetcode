class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0, high = nums.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low >= 0 && low < nums.length){
            return low;
        }

        if(low >= nums.length){
            return nums.length;
        }

        return 0;
    }
}
