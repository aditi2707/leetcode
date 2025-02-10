class Solution {

    private int findSmallestDivisor(int[] nums, int divisor){

        int sum = 0;

        for(Integer i: nums){
            sum += Math.ceil((double)i / (double)divisor);
        }

        return sum;
    }


    public int smallestDivisor(int[] nums, int threshold) {

        // Time Complexity : O(n + nlog n). The for loop will traverse through the 
        // entire array, so TC will be O(length_array). The while loop will have TC 
        // of O(log (max - 1)) as it is a binary search loop. But for every value, a
        // function is called which is running for the whole array. So TC will be 
        // O(length_array(log (max - 1))).

        // Space Complexity : O(1) 
        
        
        int max = 0;

        for(Integer i: nums){
            max = Math.max(max, i);
        }

        int low = 1, high = max;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(findSmallestDivisor(nums, mid) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
