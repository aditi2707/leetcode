class Solution {
    public long countSubarrays(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int prefixCount = 1;
        long sum = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                prefixCount += 1;
            }
            else{
                prefixCount = 1;
            }

            sum += (long)prefixCount;
        }

        return sum;







        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        
        // int[] prefixCount = new int[nums.length];
        // prefixCount[0] = 1;
        // long sum = 1;

        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] > nums[i - 1]){
        //         prefixCount[i] = prefixCount[i - 1] + 1;
        //     }
        //     else{
        //         prefixCount[i] = 1;
        //     }

        //     sum += (long)prefixCount[i];
        // }

        // return sum;
    }
}
