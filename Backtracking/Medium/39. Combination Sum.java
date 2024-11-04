class Solution {

    public void backtracking(int[] candidates, List<List<Integer>> ans, List<Integer> temp, int sum, int i){

        if(i >= candidates.length){
            return;
        }
        if(sum == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum < 0){
            return;
        }

        temp.add(candidates[i]);
        backtracking(candidates, ans, temp, sum - candidates[i], i);

        temp.remove(temp.size() - 1);
        backtracking(candidates, ans, temp, sum, i + 1);
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum = 0; 

        backtracking(candidates, ans, temp, target, 0);

        return ans;
    }
}
