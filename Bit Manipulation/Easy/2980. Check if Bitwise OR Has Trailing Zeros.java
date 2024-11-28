class Solution {
    public boolean hasTrailingZeros(int[] nums) {

        int evenCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenCount++;
            }
        }

        return evenCount >= 2;

        
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int trail = nums[i] | nums[j];
        //         if(trail % 2 == 0){
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }
}
