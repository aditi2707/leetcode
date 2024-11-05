class Solution {

    public void backtracking(int[] candidates, List<List<Integer>> ans, List<Integer> temp, int i, int sum){

        if(sum == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum < 0 || i >= candidates.length){
            return;
        }

        temp.add(candidates[i]);
        backtracking(candidates, ans, temp, i + 1, sum - candidates[i]);
        temp.remove(temp.size() - 1);

        while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
            i += 1;
        }

        backtracking(candidates, ans, temp, i + 1, sum);
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(candidates, ans, temp, 0, target);

        return ans;
    }
}
