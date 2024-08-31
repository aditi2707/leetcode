class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[nums.length+1];

        //Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            res[nums[i]] += 1;
            if(res[nums[i]] >= 2){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
