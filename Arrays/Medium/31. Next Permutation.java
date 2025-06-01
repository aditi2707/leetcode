class Solution {
    public void nextPermutation(int[] nums) {

        // Time Complexity : O(n + n + n)

        // Space Complexity : O(1)
        
        
        if(nums.length == 1){
            return;
        }

        int index = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i + 1] <= nums[i]){
                continue;
            }
            else{
                index = i;
                break;
            }
        }

        if(index != -1){
            for(int i = nums.length - 1; i > index; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }

        int low = index + 1;
        int high = nums.length - 1;

        while(low <= high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }

        return;
    }
}
