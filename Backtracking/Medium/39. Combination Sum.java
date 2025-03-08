class Solution {

    private void backtracking(List<List<Integer>> ans, List<Integer> temp, 
    int[] candidates, int target, int sum, int index){

        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(index == candidates.length || sum > target){
            return;
        }

        temp.add(candidates[index]);
        backtracking(ans, temp, candidates, target, sum + candidates[index], index);
        temp.remove(temp.size() - 1);
        backtracking(ans, temp, candidates, target, sum, index + 1);

        return;
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // Time Complexity : O(2 ^ target).
        // Each element has two choices, either to select or not select. And it will
        // go until the target value. So the height is target. Hence 
        // TC = O(2 ^ target).

        // Space Complexity : O(n) (if we ignore the output array).
        
        
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(ans, new ArrayList<>(), candidates, target, 0, 0);

        return ans;
    }
}
