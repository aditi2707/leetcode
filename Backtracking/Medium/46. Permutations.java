// Time Complexity : O(n * n!)
// Because the number of permutations for each value will be n!. For n values, it would be n * n!.
// Space Complexity : O(n + n^2)
// If the output array is ignored, then array temp is being used which has a space complexity of O(n).

class Solution {

    private void backtracking(int[] nums, int start, List<Integer> temp, 
    List<List<Integer>> ans){

        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                backtracking(nums, 0, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }
    

    public void findPermute(int[] nums, int start, List<List<Integer>> ans){
        
        if(start == nums.length-1){
            List<Integer> arr = new ArrayList<>();
            for(Integer i: nums){
                arr.add(i);
            }
            ans.add(arr);
            return;
        }

        for(int i = start; i < nums.length; i++){

            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;

            findPermute(nums, start+1, ans);
            temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(nums, 0, temp, ans);

        return ans;

        
        
        // List<List<Integer>> ans = new ArrayList<>();
        // findPermute(nums, 0, ans);

        // return ans;
    }
}
