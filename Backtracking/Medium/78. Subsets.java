class Solution {

    private void backtracking(int[] nums, int start, List<Integer> temp, 
    List<List<Integer>> ans){

        if(start == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[start]);
        backtracking(nums, start + 1, temp, ans);
        temp.remove(temp.size() - 1);
        backtracking(nums, start + 1, temp, ans);

        return;
    }


    // private void backtracking(int[] nums, int start, List<Integer> temp, 
    // List<List<Integer>> ans){

    //     if(start == nums.length){
    //         if(!ans.contains(temp)){
    //             ans.add(new ArrayList<>(temp));
    //         }
    //         return;
    //     }

    //     for(int i = start; i < nums.length; i++){
    //         temp.add(nums[i]);
    //         backtracking(nums, i + 1, temp, ans);
    //         temp.remove(temp.size() - 1);
    //         backtracking(nums, i + 1, temp, ans);
    //     }

    //     return;
    // }


    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(nums, 0, temp, ans);

        return ans;
    }
}
