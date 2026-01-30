class Solution {
    public void sortColors(int[] nums) {

        // Time Complexity : O(n + n)
        // In the worst case, the nums can contain all zeroes. So the loop will run 
        // for every index in both the loops. 

        // Space Complexity : O(1)

        
        int j = nums.length - 1;
        int i = 0;

        while(i <= j){
            if(nums[j] == 2){
                j--;
                continue;
            }
            if(nums[i] == 2){
                int temp = nums[j];
                nums[j] = 2;
                nums[i] = temp;
                j--;
            }
            i++;
        }

        i = 0;
        while(i <= j){
            if(nums[j] == 1){
                j--;
                continue;
            }
            if(nums[i] == 1){
                int temp = nums[j];
                nums[j] = 1;
                nums[i] = temp;
                j--;
            }
            i++;
        }

        return;






        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(1)

        
        // int t = 0, o = 0, z = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         z += 1;
        //     }
        //     else if(nums[i] == 1){
        //         o += 1;
        //     }
        //     else{
        //         t += 1;
        //     }
        // }

        // for(int i = nums.length - 1; i >= 0; i--){
        //     if(t > 0){
        //         nums[i] = 2;
        //         t -= 1;
        //     }
        //     else if(o > 0){
        //         nums[i] = 1;
        //         o -= 1;
        //     }
        //     else{
        //         nums[i] = 0;
        //         z -= 1;
        //     }
        // }

        // return;
    }
}
