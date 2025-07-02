class Solution {
    public int minimumOperations(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            set.add(nums[i]);
        }

        return set.size();
    }
}
