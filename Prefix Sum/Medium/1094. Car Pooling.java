class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        // Time Complexity : O(n + 1000)

        // Space Complexity : O(1000)
        
        
        int[] distance = new int[1002];

        for(int[] i: trips){
            distance[i[1]] += i[0];
            distance[i[2]] -= i[0];
        }

        if(distance[0] > capacity){
            return false;
        }

        for(int i = 1; i < distance.length; i++){
            distance[i] += distance[i - 1];
            if(distance[i] > capacity){
                return false;
            }
        }

        return true;
    }
}
