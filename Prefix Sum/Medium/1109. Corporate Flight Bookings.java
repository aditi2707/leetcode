class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        // Time Complexity : O(arr_len + n)
        // Space Complexity : O(n) (for output array)
        

        int[] ans = new int[n];

        for(int i = 0; i < bookings.length; i++){
            int start = bookings[i][0] - 1;
            int end = bookings[i][1] - 1;
            int val = bookings[i][2];

            ans[start] += val;
            if(end + 1 < n){
                ans[end + 1] -= val;
            }
        }

        for(int i = 1; i < ans.length; i++){
            ans[i] += ans[i - 1];
        }

        return ans;


        // // Time Complexity : O(arr_len ^ 2)
        // // Space Complexity : O(n) (for output array)

        
        // int[] ans = new int[n];

        // for(int i = 0; i < bookings.length; i++){
        //     for(int j = bookings[i][0]; j <= bookings[i][1]; j++){
        //         ans[j - 1] += bookings[i][2];
        //     }
        // }

        // return ans;
    }
}
