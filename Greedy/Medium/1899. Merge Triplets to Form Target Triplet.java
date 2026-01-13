class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int max1 = 0, max2 = 0, max3 = 0;

        for(int i = 0; i < triplets.length; i++){
            if(triplets[i][0] > target[0]){  
                continue;
            }
            if(triplets[i][1] > target[1]){  
                continue;
            }
            if(triplets[i][2] > target[2]){  
                continue;
            }
            max1 = Math.max(max1, triplets[i][0]);
            max2 = Math.max(max2, triplets[i][1]);
            max3 = Math.max(max3, triplets[i][2]);
            
            if(max1 == target[0] && max2 == target[1] && max3 == target[2]){
                return true;
            } 
        } 

        return false;
    }
}
