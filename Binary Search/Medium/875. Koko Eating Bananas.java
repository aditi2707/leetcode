class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);
        int low = 1, high = piles[piles.length - 1];

        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = 0;

            for(int i = 0; i < piles.length; i++){
                sum += Math.ceil((double)piles[i] / mid);
            }

            if(sum <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
