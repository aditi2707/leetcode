class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int steps = 0;
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            steps += nums[i];
            if(steps == 0){
                counter++;
            }
        }

        return counter;
    }
}
