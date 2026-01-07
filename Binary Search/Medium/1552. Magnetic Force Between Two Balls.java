class Solution {

    private boolean isPossible(int[] position, int mid, int m){

        int index = 0;
        m -= 1;

        for(int i = 1; i < position.length; i++){
            if(position[i] - position[index] >= mid){
                index = i;
                m -= 1;
            }
            if(m == 0){
                return true;
            }
        }

        return false;
    }


    public int maxDistance(int[] position, int m) {

        // Time Complexity : O(nlog n + (log n) * n)

        // Space Complexity : O(1)
        

        Arrays.sort(position);
        
        int max = position[position.length - 1];

        int low = 1, high = max;
        
        while(low <= high){
            int mid = (low + high) / 2;

            if(isPossible(position, mid, m)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return high;
    }
}
