class Solution {

    private void backtracking(int[] nums, Set<List<Integer>> ans, 
    List<Integer> temp, int index){

        if(index == nums.length){
            return;
        }

        for(int i = index; i < nums.length; i++){
            
            if(temp.size() == 0 || nums[i] >= temp.get(temp.size() - 1)){
                temp.add(nums[i]);
                if(temp.size() >= 2){
                    ans.add(new ArrayList<>(temp));
                }
                backtracking(nums, ans, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    public List<List<Integer>> findSubsequences(int[] nums) {
        
        Set<List<Integer>> ans = new HashSet<>();

        backtracking(nums, ans, new ArrayList<>(), 0);

        return new ArrayList<>(ans);
    }
}
