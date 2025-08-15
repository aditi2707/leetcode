class Solution {
    public int smallestEvenMultiple(int n) {

        // Time Complexity : O(1)

        // Space Complexity : O(1)
        
        
        if(n % 2 == 0){
            return n;
        }

        return n * 2;
    }
}
