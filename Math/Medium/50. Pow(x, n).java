class Solution {

    private double findPow(double x, long n){
        if(n == 0){
            return 1.0;
        }

        if(n < 0){
            x = 1.0 / x;
            n = (-1) * n;
        }

        double ans = 1.0;

        while(n != 0){
            if(n % 2 == 1){
                ans *= x;
                n -= 1;
            }
            x *= x;
            n /= 2;
        } 

        return ans;
    }


    public double myPow(double x, int n) {

        // Time Complexity : O(log n)

        // Space Complexity : O(1)
        

        return findPow(x, (long)n);        
    }
}
