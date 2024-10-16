class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);

        int[][] ans = new int[nums.length/3][3];

        // int r = 0, c = 0;

        for(int i = 0; i < nums.length; i += 3){

            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            }

            ans[i/3][0] = nums[i];
            ans[i/3][1] = nums[i+1];
            ans[i/3][2] = nums[i+2];



            // if(c < 3){
            //     ans[r][c] = nums[i];
            //     c++;
            // }
            // else{
            //     if(ans[r][c-1] - ans[r][0] > k){
            //         return new int[0][0];
            //     }
            //     r++;
            //     c = 0;
            //     ans[r][c] = nums[i];
            //     c++;
            // }
        }

        // if(ans[r][c-1] - ans[r][0] > k){
        //     return new int[0][0];
        // }

        return ans;
    }
}
