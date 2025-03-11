class Solution {

    private void backtracking(List<List<Integer>> ans, List<Integer> temp, 
    int[] candidates, int index, int target, int sum){

        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(index == candidates.length || sum > target){
            return;
        }

        int prev = -1;
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] == prev){
                continue;
            }
            temp.add(candidates[i]);
            backtracking(ans, temp, candidates, i + 1, target, 
            sum + candidates[i]);
            temp.remove(temp.size() - 1);
            prev = candidates[i];
        }
        

        return;
    }


    // public void backtracking(int[] candidates, List<List<Integer>> ans, List<Integer> temp, int i, int sum){

    //     if(sum == 0){
    //         ans.add(new ArrayList<>(temp));
    //         return;
    //     }
    //     if(sum < 0 || i >= candidates.length){
    //         return;
    //     }

    //     temp.add(candidates[i]);
    //     backtracking(candidates, ans, temp, i + 1, sum - candidates[i]);
    //     temp.remove(temp.size() - 1);

    //     while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
    //         i += 1;
    //     }

    //     backtracking(candidates, ans, temp, i + 1, sum);
    // }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        // Time Complexity : O(nlog n + 2 ^ n).
        // The array sorting will take O(nlog n) TC. The backtracking() will 
        // provide two choices, either to select or not select the value. 
        // The for loop will provide that. So TC will be O(2 ^ n).

        // Space Complexity : O(n) (if we ignore the output array).
        
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        backtracking(ans, new ArrayList<>(), candidates, 0, target, 0);

        return ans;



        
        
        // Arrays.sort(candidates);
        // List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> temp = new ArrayList<>();

        // backtracking(candidates, ans, temp, 0, target);

        // return ans;
    }
}
