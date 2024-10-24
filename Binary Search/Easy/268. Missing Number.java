class Solution {

    public boolean binarySearch(int[] arr, int n){

        int low = 0, high = arr.length-1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] == n){
                return true;
            }
            else if(arr[mid] < n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return false;
    }

    public int missingNumber(int[] nums) {

        // Arrays.sort(nums);

        // for(int i = 0; i <= nums[nums.length-1]; i++){
        //     if(!binarySearch(nums, i)){
        //         return i;
        //     }
        // }

        // return nums[nums.length-1] + 1;


        


        // int totalSum = (nums.length * (nums.length + 1))/2;
        // int sum = 0;

        // for(Integer i: nums){
        //     sum += i;
        // }

        // return totalSum - sum;






        Arrays.sort(nums);

        int low = 0, high = nums.length-1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
        




        
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums[nums.length-1] + 1;
    }    
}
