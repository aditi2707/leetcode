class Solution {
    public int mySqrt(int x) {

        // Edge cases:
        // 1. The while loop will not run for x = 0 and x = 1. So that have to
        // be handled by the base cases.
        

        // Time Complexity : O(log (x / 2))

        // Space Complexity : O(1)
        

        if(x == 0 || x == 1){
            return x;
        }
        
        long low = 1, high = x / 2;

        while(low <= high){
            long mid = (low + high) / 2;

            if((mid * mid) == (long)x){
                return (int)mid;
            }
            else if((mid * mid) < (long)x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return (int)high;






        // // Time Complexity : O(log x)

        // // Space Complexity : O(1)


        // long low = 1, high = x;

        // while(low <= high){
        //     long mid = (low + high) / 2;

        //     if((mid * mid) == (long)x){
        //         return (int)mid;
        //     }
        //     else if((mid * mid) < (long)x){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }

        // return (int)high;




        

        // return (int)(Math.sqrt(x));
    }
}
