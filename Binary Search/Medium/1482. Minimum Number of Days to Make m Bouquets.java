class Solution {

    private int findNumOfBouquets(int[] bloomDay, int day, int k){

        int m = 0, c = 0;

        for(Integer i: bloomDay){
            if(day >= i){
                c++;
            }
            else{
                m += (c / k);
                c = 0;
            }
        }

        m += (c / k);
        return m;
    }


    public int minDays(int[] bloomDay, int m, int k) {

        // Time Complexity : O(nlog (max - min))

        // Space Complexity : O(1)
        
        
        if((m * k) > bloomDay.length){
            return -1;
        }

        int min = bloomDay[0], max = bloomDay[0];

        for(Integer i: bloomDay){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int low = min, high = max;

        while(low <= high){

            int mid = (low + high) / 2;

            int bouquets = findNumOfBouquets(bloomDay, mid, k);

            if(bouquets >= m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(low > max){
            return -1;
        }

        return low;
    }
}
