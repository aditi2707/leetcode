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

        // Time Complexity : O(n * 2^n).
        // For every element in the array, there are two choices, either you take
        // that element or not. So the TC is 2^n. But those choices are for every
        // element, so TC is n * 2^n.

        // Space Complexity : O(n) (if we ignore output array and the recursion
        // stack.)
        // The temp array will have a max of all array elements so SC is O(n).
        
        
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(nums, ans, new ArrayList<>(), 0);

        return ans;
    }
}
