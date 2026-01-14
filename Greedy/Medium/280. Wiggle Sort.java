class Solution {
    public void wiggleSort(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)


        if(nums.length == 1){
            return;
        }
        
        if(nums[0] > nums[1]){
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        
        for(int i = 1; i < nums.length - 1; i++){
            if(i % 2 == 1){
                if(nums[i + 1] > nums[i]){
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
            else{
                if(nums[i + 1] < nums[i]){
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        
        return;





        // // Time Complexity : O(n + n + max + (n / 2) + (n / 2))

        // // Space Complexity : O(max)
        
        
        // int max = 0;

        // for(Integer i: nums){
        //     max = Math.max(max, i);
        // }

        // int[] freq = new int[max + 1];

        // for(Integer i: nums){
        //     freq[i] += 1;
        // }

        // int index = 0, i = 0;

        // while(i < freq.length){

        //     if(freq[i] == 0){
        //         i++;
        //         continue;
        //     }
        //     if(index >= nums.length){
        //         break;
        //     }

        //     nums[index] = i;
        //     freq[i] -= 1;
        //     index += 2;

        //     if(freq[i] == 0){
        //         i++;
        //     }
        // }

        // if(index == nums.length){
        //     index = nums.length - 1;
        // }
        // else{
        //     index = nums.length - 2;
        // }

        // i = freq.length - 1;

        // while(i >= 0){

        //     if(freq[i] == 0){
        //         i--;
        //         continue;
        //     }
        //     if(index < 0){
        //         break;
        //     }

        //     nums[index] = i;
        //     freq[i] -= 1;
        //     index -= 2;

        //     if(freq[i] == 0){
        //         i--;
        //     }
        // }

        
        // return;






        // // Time Complexity : O(nlog n + (n / 2) + (n / 2) + n)

        // // Space Complexity : O(n)

        
        // Arrays.sort(nums);
        // int[] arr = new int[nums.length];
        // int index = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(index >= nums.length){
        //         break;
        //     }
        //     arr[index] = nums[i];
        //     index += 2;
        // }

        // if(index == nums.length){
        //     index = nums.length - 1;
        // }
        // else{
        //     index = nums.length - 2;
        // }

        
        // for(int i = nums.length - 1; i >= 0; i--){
        //     if(index < 0){
        //         break;
        //     }
        //     arr[index] = nums[i];
        //     index -= 2;
        // }

        // for(int i = 0; i < arr.length; i++){
        //     nums[i] = arr[i];
        // }

        
        // return;
    }
}
