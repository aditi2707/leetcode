class Solution {
    public void moveZeroes(int[] nums) {

        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            if(nums[i] != 0){
                if(nums[curr] == 0){
                    int temp = nums[i];
                    nums[i] = nums[curr];
                    nums[curr] = temp;
                }
                curr++;
            }
        }

        return;
        
 /*     int temp = nums.length-1;
        int i = 0;

        while(temp >= i){
            if(nums[i] == 0){
                for(int j = i+1; j <= temp; j++){
                    nums[j-1] = nums[j];
                }
                nums[temp] = 0;
                temp = temp - 1;
            }
            if(nums[i] == 0){
                continue;
            }
            else{
                i++;
            }
        }
        for(int k = 0; k < nums.length; k++){
            System.out.print(nums[k]);
        }
*/
        // int j = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //         j++;
        //     }
        // }

    }
}
