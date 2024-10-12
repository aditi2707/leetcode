class Solution {

    public int firstOccurence(int[] arr, int n){

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] < n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low < arr.length && arr[low] == n){
            return low;
        }

        return -1;
    }

    public int lastOccurence(int[] arr, int n){

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] <= n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high >= 0 && arr[high] == n){
            return high;
        }

        return -1;
    }

    public boolean isMajorityElement(int[] nums, int target) {

        if(firstOccurence(nums, target) == -1 || lastOccurence(nums, target) == -1){
            return false;
        }
        
        if((lastOccurence(nums, target) - firstOccurence(nums, target) + 1) * 2 > nums.length){
            return true;
        }

        return false;
    }
}
