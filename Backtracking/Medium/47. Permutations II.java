class Solution {

    private void backtracking(int[] nums, List<List<Integer>> ans, 
    List<Integer> temp, Set<Integer> freq){

        if(temp.size() == nums.length && !ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!freq.contains(i)){
                temp.add(nums[i]);
                freq.add(i);

                backtracking(nums, ans, temp, freq);

                temp.remove(temp.size() - 1);
                freq.remove(i);
            }
        }

        return;
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> freq = new HashSet<>();

        backtracking(nums, ans, new ArrayList<>(), freq);

        return ans;
    }
}
