class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }

        return ans;





        

        // int i = 0;
        // Arrays.sort(nums);

        // while(i < nums.length-2){
        //     if(nums[i] == nums[i+1]){
        //         i = i + 2;
        //     }
        //     else{
        //         return nums[i];
        //     }
        // }
        // return nums[i];
    }
}
