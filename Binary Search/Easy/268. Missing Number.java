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

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        

        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 0){
                return i;
            }
        }

        return -1;



        

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






        // Arrays.sort(nums);

        // int low = 0, high = nums.length-1;

        // while(low <= high){
        //     int mid = (low + high) / 2;
        //     if(nums[mid] == mid){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }

        // return low;
        




        
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums[nums.length-1] + 1;
    }    
}
