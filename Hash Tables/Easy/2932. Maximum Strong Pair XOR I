class Solution {
    public int maximumStrongPairXor(int[] nums) {
        
        int max = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int j = i;
            while(j < nums.length && nums[j] <= nums[i]*2){
                int diff = (int)Math.abs(nums[i] - nums[j]);
                int min = (int)Math.min(nums[i], nums[j]);

                if(diff <= min){
                    int xor = nums[i] ^ nums[j];
                    if(xor > max){
                        max = xor;
                    }
                }
                j++;
            }
        }

/* *****************************************************
Original approach
***************************************************** */

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i; j < nums.length; j++){
        //         int diff = (int)Math.abs(nums[i] - nums[j]);
        //         int min = (int)Math.min(nums[i], nums[j]);

        //         if(diff <= min){
        //             int xor = nums[i] ^ nums[j];
        //             if(xor > max){
        //                 max = xor;
        //             }
        //         }
        //     }
        // }

/* **************************************************** */

        return max;
    }
}
