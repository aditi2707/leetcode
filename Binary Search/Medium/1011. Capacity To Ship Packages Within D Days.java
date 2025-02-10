class Solution {

    private boolean isCapacity(int[] weights, int days, int maxCapacity){

        int day = 1, load = 0;

        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > maxCapacity){
                day += 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }

        return day <= days;
    }


    public int shipWithinDays(int[] weights, int days) {

        // Time Complexity : O(n + nlog n) because the for loop will traverse
        // through entire array. The while loop will take 
        // O(log(totalCapacity - maxWeight)) because it is using binary search. But for 
        // each value, the function will run for the length of the array. So, the time
        // complexity will be O(length_array * log(totalCapacity - maxWeight)).
        
        // Space Complexity : O(1)
        
        int totalCapacity = 0, maxWeight = 0;

        for(Integer i: weights){
            totalCapacity += i;
            maxWeight = Math.max(maxWeight, i);
        }

        int low = maxWeight, high = totalCapacity;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isCapacity(weights, days, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
