class Solution {
    public int countPairs(int[] nums, int k) {

        // Time Complexity : O(n ^ 2)

        // Space Complexity : O(1)
        
        
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if((i * j) % k == 0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
