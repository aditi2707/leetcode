class Solution {
    public int longestSubarray(int[] nums) {
        
        int max = 0;
        int maxCounter = 0;
        int counter = 0;

        for(Integer i: nums){
            max = Math.max(max, i);
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                counter++;
            }
            if(nums[i] != max){
                maxCounter = Math.max(maxCounter, counter);
                counter = 0;
            }
        }

        if(nums[nums.length-1] == max){
            return Math.max(maxCounter, counter);
        }
        
        return maxCounter;
    }
}
