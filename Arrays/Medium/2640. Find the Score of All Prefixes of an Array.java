class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        int max = nums[0];
        long[] conver = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            conver[i] = nums[i] + max;
        }

        for(int i = 1; i < conver.length; i++){
            conver[i] += conver[i-1];
        }

        return conver;
    }
}
