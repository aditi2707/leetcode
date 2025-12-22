class Solution {

    private int countDaysII(int[] weights, int cap, int days){

        int sum = 0, d = 0;

        for(Integer i: weights){
            sum += i;
            if(sum > cap){
                d++;
                sum = i;
            }
        }

        if(sum <= cap){
            d++;
        }

        return d;
    }


    private int countDays(int[] weights, int cap, int days){

        int sum = 0, d = 0;

        for(Integer i: weights){
            if(i > cap){
                return Integer.MAX_VALUE;
            }
            sum += i;
            if(sum > cap){
                d++;
                sum = i;
            }
        }

        if(sum <= cap){
            d++;
        }

        return d;
    }


    public int shipWithinDays(int[] weights, int days) {

        // Time Complexity : O(n + nlog (sum - max))

        // Space Complexity : O(1)
        
        
        int maxWt = weights[0], max = 0;

        for(Integer i: weights){
            maxWt = Math.max(maxWt, i);
            max += i;
        }

        int low = maxWt, high = max;

        while(low <= high){

            int mid = (low + high) / 2;

            int d = countDaysII(weights, mid, days);

            if(d <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;






        

        // // Time Complexity : O(n + nlog (sum - min))

        // // Space Complexity : O(1)

        
        // int min = weights[0], max = 0;

        // for(Integer i: weights){
        //     min = Math.min(min, i);
        //     max += i;
        // }

        // int low = min, high = max;

        // while(low <= high){

        //     int mid = (low + high) / 2;

        //     int d = countDays(weights, mid, days);

        //     if(d <= days){
        //         high = mid - 1;
        //     }
        //     else{
        //         low = mid + 1;
        //     }
        // }

        // return low;
    }
}
