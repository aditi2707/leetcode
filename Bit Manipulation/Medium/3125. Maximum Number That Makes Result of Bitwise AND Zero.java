class Solution {
    public long maxNumber(long n) {

        // Time Complexity : O(log n)

        // Space Complexity : O(1)
        
        
        long num = 1;

        while((num << 1) <= n){
            num <<= 1;
        }

        return num - 1;







        // // Time Complexity : O(log (high))

        // // Space Complexity : O(1)

        
        // long low = 1, high = 61;

        // while(low <= high){

        //     long mid = (low + high) / 2;

        //     if(((long)(Math.pow(2, mid) - 1)) < n){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }

        // return (long)(Math.pow(2, high) - 1);
    }
}
