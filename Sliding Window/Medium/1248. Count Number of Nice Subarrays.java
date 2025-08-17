class Solution {

    private int atMost(int[] nums, int k){

        // Time Complexity : O(n)
        // Although it looks like there are two nested loops, each value will only
        // be traversed atmost twice.

        // Space Complexity : O(1)
        

        int i = 0, j = 0;
        int odd = 0;
        int count = 0;

        while(j < nums.length){

            if(nums[j] % 2 == 1){
                odd++;
            }

            while(i <= j && odd > k){
                if(nums[i] % 2 == 1){
                    odd--;
                }
                i++;
            }

            count += (j - i + 1);
            j++;
        }

        return count;
    }


    public int numberOfSubarrays(int[] nums, int k) {
        
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}
