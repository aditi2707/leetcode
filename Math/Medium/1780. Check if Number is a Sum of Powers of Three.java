class Solution {
    public boolean checkPowersOfThree(int n) {

        // Time Complexity : O(log n base 3).
        // Because we are only iterating through powers of 3.

        // Space Complexity : O(1).
        
        
        int i = 0;

        while((int)Math.pow(3, i) < n){
            i++;
        }

        while(i >= 0){
            int num = (int)Math.pow(3, i);
            if(n - num == 0){
                return true;
            }
            else if(n - num < 0){
                i--;
            }
            else{
                n -= num;
                i--;
            }
        }

        return false;
    }
}
