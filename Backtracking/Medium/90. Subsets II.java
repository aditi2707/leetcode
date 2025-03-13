class Solution {

    private void backtracking(List<List<Integer>> ans, List<Integer> temp, 
    int[] nums, int index){

        if(index == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        backtracking(ans, temp, nums, index + 1);
        temp.remove(temp.size() - 1);

        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index += 1;
        }

        backtracking(ans, temp, nums, index + 1);

        return;
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        backtracking(ans, new ArrayList<>(), nums, 0);

        return ans;
    }
}
