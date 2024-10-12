class Solution {
    public int mySqrt(int x) {

        long low = 1, high = x;

        while(low <= high){

            long mid = low + (high - low)/2;

            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return (int)low-1;

        // return (int)(Math.sqrt(x));
    }
}
