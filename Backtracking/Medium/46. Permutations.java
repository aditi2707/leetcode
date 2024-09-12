class Solution {

    public void findPermute(int[] nums, int start, List<List<Integer>> ans){
        
        if(start == nums.length-1){
            List<Integer> arr = new ArrayList<>();
            for(Integer i: nums){
                arr.add(i);
            }
            ans.add(arr);
            return;
        }

        for(int i = start; i < nums.length; i++){

            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;

            findPermute(nums, start+1, ans);
            temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        findPermute(nums, 0, ans);

        return ans;
    }
}
