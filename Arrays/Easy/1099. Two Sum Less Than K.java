class Solution {

    public int binarySearch(int[] arr, int low, int k){

        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(arr[low - 1] < k){
            return low - 1;
        }

        return -1;
    }

    
    public int twoSumLessThanK(int[] nums, int k) {

        // Arrays.sort(nums);
        // int sum = -1;

        // for(int i = 0; i < nums.length; i++){
        //     int target = k - nums[i];

        //     int ind = binarySearch(nums, i+1, target);

        //     if(ind != -1 && ind != i){
        //         sum = Math.max(sum, nums[i] + nums[ind]);
        //     }
        // }

        // return sum;


        
        
        int maxSum = -1;

        int p = 0, q = nums.length-1;

        Arrays.sort(nums);

        while(p < q){
            if(nums[p] + nums[q] >= k){
                q--;
            }
            else{
                if(nums[p]+nums[q] > maxSum)
                maxSum = nums[p]+nums[q];
                p++;
            }
        }

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int sum = nums[i] + nums[j];
        //         if(sum < k && sum > maxSum){
        //             maxSum = sum;
        //         }
        //     }
        // }

        return maxSum;
    }
}
