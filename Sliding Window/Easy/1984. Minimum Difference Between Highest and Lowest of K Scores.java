class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);

        int i = 0, j = 0, diff = Integer.MAX_VALUE;

        while(j < nums.length){

            if((j - i + 1) < k){
                j++;
            }
            else if((j - i + 1) == k){
                diff = Math.min(diff, nums[j] - nums[i]);
                i++;
                j++;
            }
        }

        return diff;
    }
}
