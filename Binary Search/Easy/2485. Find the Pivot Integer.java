class Solution {
    public int pivotInteger(int n) {

        // Time Complexity : O(log n)

        // Space Complexity : O(1)
        

        int total = (n * (n + 1)) / 2;

        int low = 1, high = n;

        while(low <= high){
            int mid = (high + low) / 2;
            int left = (mid * (mid + 1)) / 2;
            int right = total - left + mid;
            
            if(left == right){
                return mid;
            }
            else if(left < right){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;





        // // Time Complexity : O(n)

        // // Space Complexity : O(1)

        
        // int left = 0, right = 0;

        // for(int i = 1; i <= n; i++){
        //     right += i;
        // }

        // for(int i = 1; i <= n; i++){
        //     left += i;
        //     if(left == right){
        //         return i;
        //     }
        //     right -= i;
        // }

        // return -1;
    }
}
