class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int ans = Integer.MIN_VALUE;
        int i = 0, j = 0, sum = 0;

        while(j < nums.length){

            if((j - i + 1) <= k){
                sum += nums[j];
                j++;
            }
            else{
                ans = Math.max(ans, sum);
                sum -= nums[i];
                i++;
                sum += nums[j];
                j++;
            }
        }

        ans = Math.max(ans, sum);

        return (double)ans / k;
    }
}
