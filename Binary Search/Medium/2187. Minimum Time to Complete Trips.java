class Solution {

    public long minimumTime(int[] time, int totalTrips) {

        // Time Complexity : O(n + nlog (totalTrips * m))
        // If we consider the upper limit as m, then the upper bound is m * totalTrips.
        // So instead of array length, it will be this.

        // Space Complexity : O(1)

        
        long low = 1;
        int max = 0;

        for(Integer i: time){
            max = Math.max(max, i);
        }

        long high = (long)max * totalTrips;

        while(low <= high){
            long mid = (low + high) / 2;

            long sum = 0;
            for(Integer i: time){
                sum += mid / i;
            }
            if(sum >= totalTrips){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
