class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        
        int maxSum = -1;

        int p = 0, q = nums.length-1;

        Arrays.sort(nums);

        while(p < q){
            if(nums[p] + nums[q] >= k){
                q--;
            }
            else{
                if(nums[p]+nums[q] > maxSum)
                maxSum = nums[p]+nums[q];
                p++;
            }
        }

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int sum = nums[i] + nums[j];
        //         if(sum < k && sum > maxSum){
        //             maxSum = sum;
        //         }
        //     }
        // }

        return maxSum;
    }
}
