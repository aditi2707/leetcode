class Solution {

    public void backtracking(int[] nums, List<List<Integer>> ans, List<Integer> temp, int s){

        if(s >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[s]);
        backtracking(nums, ans, temp, s + 1);

        temp.remove(temp.size() - 1);
        backtracking(nums, ans, temp, s + 1);
    }


    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(nums, ans, temp, 0);

        return ans;
    }
}
