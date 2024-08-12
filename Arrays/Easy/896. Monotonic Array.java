class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean inc = false, dec = false;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                inc = true;
                if(dec == true){
                    return false;
                }
            }
            else if(nums[i] < nums[i-1]){
                dec = true;
                if(inc == true){
                    return false;
                }
            }
            else{
                continue;
            }
        }

        return true;
    }
}
