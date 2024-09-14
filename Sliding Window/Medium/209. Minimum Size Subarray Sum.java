class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;

        while(j < nums.length){

            sum += nums[j];

            while(sum >= target){
                min = Math.min(min, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        if(min == Integer.MAX_VALUE){
            return 0;
        }

        return min;
    }
}
