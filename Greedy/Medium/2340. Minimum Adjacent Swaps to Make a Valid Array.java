class Solution {
    public int minimumSwaps(int[] nums) {

        if(nums.length == 1){
            return 0;
        }
        
        int maxPos = 0, minPos = 0;
        int max = 0, min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minPos = i;
            }
            if(nums[i] >= max){
                max = nums[i];
                maxPos = i;
            }
        }

        if(maxPos > minPos){
            return (nums.length - 1 - maxPos) + minPos;
        }
        
        return (nums.length - 1 - maxPos) + minPos - 1;
    }
}
