class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int c = 0;

        Arrays.sort(nums);

        for(int i = nums.length-1; i >= 0; i--){
            sum += nums[i];
        }

        for(int i = nums.length-1; i >= 0; i--){
            ans.add(nums[i]);
            sum -= nums[i];
            c += nums[i];
            if(c > sum){
                return ans;
            }
        }

        return ans;
    }
}
