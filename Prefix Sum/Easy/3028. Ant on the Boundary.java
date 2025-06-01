class Solution {
    public int returnToBoundaryCount(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int boundary = 0, count = 0;

        for(Integer i: nums){
            boundary += i;
            if(boundary == 0){
                count++;
            }
        }

        return count;
    }
}
