class Solution {
    public int findKthPositive(int[] arr, int k) {

        // Time Complexity : O(log n)

        // Space Complexity : O(1)


        int low = 0, high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] - mid - 1 < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low + k;






        // // Time Complexity : O(n + max)

        // // Space Complexity : O(n)
        
        
        // Set<Integer> set = new HashSet<>();
        // int count = 0;

        // for(int i = 0; i < arr.length - 1; i++){
        //     count += arr[i + 1] - arr[i] - 1;
        //     set.add(arr[i]);
        // }

        // count += arr[0] - 1;
        // set.add(arr[arr.length - 1]);

        // if(count < k){
        //     return arr[arr.length - 1] + (k - count);
        // }

        // for(int i = arr[arr.length - 1]; i >= 1; i--){
        //     if(!set.contains(i)){
        //         count--;
        //     }
        //     if(count == k - 1){
        //         return i;
        //     }
        // }

        // return -1;

    }
}
