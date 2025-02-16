class Solution {

    private void backtracking(int[] nums, List<List<Integer>> ans, int ind){

        if(ind == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(Integer i: nums){
                temp.add(i);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = ind; i < nums.length; i++){
            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;

            backtracking(nums, ans, ind + 1);

            temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;
        }

        return;
    }


    private void backtracking(int[] nums, List<List<Integer>> ans, 
    List<Integer> temp){

        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                backtracking(nums, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    public List<List<Integer>> permute(int[] nums) {

        // Time Complexity : O(n * n!).
        // The swaps will take O(1) TC. The for loop in the backtracking() will run 
        // for all array elements, so that will be O(n). The swaps done for each 
        // element will be equal to its factorial, so that becomes O(n!).
        // Hence TC is O(n * n!).

        // Space Complexity : O(1) (if we ignore the SC of the output array and the
        // recursion stack).


        List<List<Integer>> ans = new ArrayList<>();

        backtracking(nums, ans, 0);

        return ans;





        // Time Complexity : O(n * n!).
        // The for loop in the backtracking() will run for all array elements, so 
        // that will be O(n). But the function will be called only when a permutation
        // is possible. So that makes O(n!). Hence TC is O(n * n!).

        // Space Complexity : O(n) (if we ignore the SC of the output array and the
        // recursion stack).
        // The temp array will have a maximum of all array elements, so O(n).

        
        // List<List<Integer>> ans = new ArrayList<>();

        // backtracking(nums, ans, new ArrayList<>());

        // return ans;
    }
}
