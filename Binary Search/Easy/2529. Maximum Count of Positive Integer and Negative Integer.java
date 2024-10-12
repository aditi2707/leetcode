class Solution {

    public int firstOccurence(int[] arr){

        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] <= 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low < arr.length && arr[low] > 0){
            return low;
        }

        return Integer.MIN_VALUE;
    }

    public int lastOccurence(int[] arr){

        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] < 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high >= 0 && arr[high] < 0){
            return high;
        }

        return Integer.MIN_VALUE;
    }

    public int maximumCount(int[] nums) {

        int positive = nums.length - firstOccurence(nums);
        int negative = lastOccurence(nums) + 1;

        if(positive == nums.length - Integer.MIN_VALUE && negative == Integer.MIN_VALUE + 1){
            return 0;
        }

        return Math.max(positive, negative);










        
        // int low = 0, high = nums.length-1;
        // int nCounter = 0, pCounter = 0;

        // while(low < high){

        //     if(nums[low] < 0){
        //         low++;
        //     }
        //     if(nums[high] > 0){
        //         high--;
        //     }
        //     if(nums[low] >= 0){
        //         nCounter = low;
        //         high--;
        //     }
        //     if(nums[high] <= 0){
        //         pCounter = nums.length-1-high;
        //         low++;
        //     }
        // }

        // return Math.max(nCounter, pCounter);



        

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < 0){
        //         nCounter++;
        //     }

        //     if(nums[i] > 0){
        //         pCounter++;
        //     }
        // }
        // return Math.max(nCounter, pCounter);
    }
}
