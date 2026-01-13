class Solution {
    public int minimumOperations(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int count = 0, i = 0, j = nums.length - 1;
        int palin = 0;

        while(i < j){
            if(nums[i] < nums[j]){
                nums[i + 1] += nums[i];
                count++;
                i++;
            }
            else if(nums[i] > nums[j]){
                nums[j - 1] += nums[j];
                count++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }

        return count;







        // // Time Complexity : O(n)

        // // Space Complexity : O(1)

        
        // int count = 0, i = 0, j = nums.length - 1;
        // int palin = 0;

        // while(i < j){
        //     if(nums[i] < nums[j]){
        //         if(i + 1 < j){
        //             nums[i + 1] += nums[i];
        //             count++;
        //         }
        //         if(nums[i + 1] == nums[j]){
        //             i += 2;
        //             j--;
        //         }
        //         else{
        //             i++;
        //         }
        //     }
        //     else if(nums[i] > nums[j]){
        //         if(j - 1 > i){
        //             nums[j - 1] += nums[j];
        //             count++;
        //         }
        //         if(nums[j - 1] == nums[i]){
        //             j -= 2;
        //             i++;
        //         }
        //         else{
        //             j--;
        //         }
        //     }
        //     else{
        //         i++;
        //         j--;
        //         palin++;
        //     }
        // }

        // if(i > j && palin != nums.length / 2){
        //     count++;
        // }

        // return count;
    }
}
