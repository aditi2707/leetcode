class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int maxSum = 0;

        for(int i = 0; i < nums.length/2; i++){
            int sum = nums[i] + nums[nums.length-1-i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
