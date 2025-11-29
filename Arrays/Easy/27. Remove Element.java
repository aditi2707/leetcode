class Solution {
    public int removeElement(int[] nums, int val) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        

        if(nums.length == 0){
            return 0;
        }
        
        int index = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                if(index == -1){
                    index = i;
                }
                else{
                    continue;
                }
            }
            else{
                if(index != -1){
                    nums[index] = nums[i];
                    nums[i] = val;
                    index++;
                }
            }
        }

        return index == -1? nums.length : index;
    }
}
