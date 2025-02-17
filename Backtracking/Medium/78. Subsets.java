class Solution {

    private void backtracking(int[] nums, List<List<Integer>> ans, 
    List<Integer> temp, int ind){

        if(ind == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[ind]);
        backtracking(nums, ans, temp, ind + 1);
        temp.remove(temp.size() - 1);
        backtracking(nums, ans, temp, ind + 1);

        return;
    }


    // private void backtracking(int[] nums, List<List<Integer>> ans, 
    // List<Integer> temp, int ind){

    //     ans.add(new ArrayList<>(temp));

    //     for(int i = ind; i < nums.length; i++){
    //         temp.add(nums[i]);
    //         backtracking(nums, ans, temp, i + 1);
    //         temp.remove(temp.size() - 1);
    //     }

    //     return;
    // }


    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(nums, ans, new ArrayList<>(), 0);

        return ans;
    }
}
