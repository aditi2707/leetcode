class Solution {
    public int removeDuplicates(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int index = -1;
        int counter = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                counter++;
                if(counter > 2){
                    if(index == -1){
                        index = i;
                    }
                }
                else{
                    if(index != -1){
                        nums[index] = nums[i];
                        index++;
                    }
                }            
            }
            else{
                counter = 1;
                if(index == -1){
                    continue;
                }
                nums[index] = nums[i];
                index++;
            }
        }

        return index == -1? nums.length : index;
    }
}
