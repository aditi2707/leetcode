class Solution {

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums, int k, List<List<Integer>> output) {

        if (curr.size() == k){
            output.add(new ArrayList(curr));
        }
        
        for (int i = first; i < nums.length; ++i) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums, k, output);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> output = new ArrayList();

        for (int k = 0; k <= nums.length; ++k) {
            ArrayList<Integer> currCombo = new ArrayList<Integer>();
            backtrack(0, currCombo, nums, k, output);
        }
        return output;
    }
}
