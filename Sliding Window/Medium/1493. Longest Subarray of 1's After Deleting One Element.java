class Solution {
    public int longestSubarray(int[] nums) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)
        
        
        int z = 0, o = 0, max = 0, i = 0, j = 0;

        while(j < nums.length){
            if(nums[j] == 0){
                z++;
            }
            else{
                o++;
            }

            if(z == 2){
                max = Math.max(max, o);
                while(z >= 2){
                    if(nums[i] == 0){
                        z--;
                    }
                    else{
                        o--;
                    }
                    i++;
                }
            }
            j++;
        }

        if(nums.length == o){
            return o - 1;
        }

        return Math.max(max, o);
    }
}
