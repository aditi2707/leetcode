class Solution {

    public void backtracking(int[] nums, List<List<Integer>> ans, List<Integer> temp, int i){

        if(i >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        backtracking(nums, ans, temp, i + 1);

        temp.remove(temp.size() - 1);

        while(i + 1 < nums.length && nums[i] == nums[i+1]){
            i += 1;
        }
        backtracking(nums, ans, temp, i + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(nums, ans, temp, 0);

        return ans;
    }
}
