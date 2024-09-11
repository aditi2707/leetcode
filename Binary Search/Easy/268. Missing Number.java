class Solution {

    public int missingNumber(int[] nums) {
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
