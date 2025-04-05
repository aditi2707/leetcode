class Solution {
    public int getSum(int a, int b) {

        // Time Complexity : O(1)

        // Space Complexity : O(1)
        
        
        while(b != 0){
            int xor = a ^ b;
            int and = (a & b) << 1;
            a = xor;
            b = and;
        }

        return a;
    }
}
