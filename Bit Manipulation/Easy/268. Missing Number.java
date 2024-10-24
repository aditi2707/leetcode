class Solution {
    public int missingNumber(int[] nums) {

        int totalXor = 0;

        for(int i = 0; i <= nums.length; i++){
            totalXor ^= i;
        }

        for(int i = 0; i < nums.length; i++){
            totalXor ^= nums[i];
        }

        return totalXor;
    }
}
