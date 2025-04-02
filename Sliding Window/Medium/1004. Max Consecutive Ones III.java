class Solution {
    public int longestOnes(int[] nums, int k) {

        // Time Complexity : O(n)
        // Space Complexity : O(1)
        
        
        int i = 0, j = 0;
        int zeroes = 0, max = 0;

        while(j < nums.length){
            if(nums[j] == 0){
                zeroes++;
            }

            if(zeroes > k){
                while(i <= j && zeroes > k){
                    if(nums[i] == 0){
                        zeroes--;
                    }
                    i++;
                }
            }
            max = Math.max(max, (j - i + 1));
            j++;
        }

        return max;
    }
}
