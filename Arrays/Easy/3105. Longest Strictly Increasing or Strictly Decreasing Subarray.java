class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int inc = 1;
        int dec = 1;
        int max = 1;
        int j = 1;

        while(j < nums.length){
            if(nums[j] > nums[j - 1]){
                inc += 1;
                dec = 1;
            }
            else if(nums[j] < nums[j - 1]){
                inc = 1;
                dec += 1;
            }
            else{
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
            j++;
        }

        return max;



        
        // int max = 1;
        // int i = 0, j = 1;
        // int count = 1;

        // while(j < nums.length){
        //     if(nums[j] > nums[j - 1]){
        //         count += 1;
        //         j++;
        //     }
        //     else{
        //         max = Math.max(max, count);
        //         count = 1;
        //         i = j;
        //         j++;
        //     }
        // }

        // max = Math.max(max, count);

        // i = 0; j = 1;
        // count = 1;

        // while(j < nums.length){
        //     if(nums[j] < nums[j - 1]){
        //         count += 1;
        //         j++;
        //     }
        //     else{
        //         max = Math.max(max, count);
        //         count = 1;
        //         i = j;
        //         j++;
        //     }
        // }

        // max = Math.max(max, count);

        // return max;
    }
}
