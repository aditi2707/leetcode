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

        // Include/exclude recurses down to the end before recording subsets
        // The for-loop method doesn’t - it generates subsets along the way

        // Time Complexity : O(n * (2 ^ n))
        // The for-loop or the recursion will alone take 2^n time as there are
        // two choices for each element, take or not take.
        // But the copying of the array into the final array takes upto O(n) time.
        // Hence TC = O(n * (2 ^ n))

        // Space Complexity : For include/exclude method, O(n + n + (n * (2 ^ n)))
        // The recursion stack will have only one branch at a time, so O(n).
        // Also the temp array can have a maximum of n elements, so O(n).
        // The output array, if considered will have all the 2 ^ n subsets and 
        // the length of these can extend upto n.

        // Space Complexity : For for-loop method, O(n + (n * (2 ^ n)))
        // The temp array can have a maximum of n elements, so O(n).
        // The output array, if considered will have all the 2 ^ n subsets and 
        // the length of these can extend upto n.
        
        
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(nums, ans, new ArrayList<>(), 0);

        return ans;
    }
}
