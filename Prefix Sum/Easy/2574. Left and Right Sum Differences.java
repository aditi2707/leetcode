class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int totalLeft = 0;
        int totalRight = 0;
        int[] ans = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            totalRight += nums[i];
        }

        ans[0] = totalRight;

        for(int i = 1; i < nums.length; i++){

            if(i == nums.length-1){
                ans[i] = totalLeft + nums[i-1];
                continue;
            }
            totalLeft += nums[i-1];
            totalRight -= nums[i];
            ans[i] = Math.abs(totalLeft - totalRight);
        }

        return ans;
    }
}
