class Solution {
    public long[] maximumCoins(int[] heroes, int[] monsters, int[] coins) {

        // Time Complexity : O(m + mlog m + m + hlog m)

        // Space Complexity : O(m + m)

        
        int max = 0;
        long[] ans = new long[heroes.length];

        int[][] arr = new int[monsters.length][2];

        for(int i = 0; i < monsters.length; i++){
            arr[i][0] = monsters[i];
            arr[i][1] = coins[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        long[] prefix = new long[monsters.length];
        prefix[0] = arr[0][1];

        for(int i = 1; i < monsters.length; i++){
            prefix[i] = prefix[i - 1] + arr[i][1];
        }

        for(int i = 0; i < heroes.length; i++){
            int target = heroes[i];

            int low = 0, high = arr.length - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(arr[mid][0] <= target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(high >= 0){
                ans[i] = prefix[high];
            }
        }

        return ans;





        
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // long[] ans = new long[heroes.length];
        // long[] prefix = new long[monsters.length];

        // for(int i = 0; i < monsters.length; i++){
        //     minHeap.add(new int[]{monsters[i], coins[i]});
        // }

        // for(int i = 0; i < monsters.length; i++){
        //     int[] arr = minHeap.poll();
        //     monsters[i] = arr[0];
        //     coins[i] = arr[1];

        //     if(i == 0){
        //         prefix[i] = coins[i];
        //     }
        //     else{
        //         prefix[i] = prefix[i-1] + coins[i];
        //     }
        // }

        // for(int i = 0; i < heroes.length; i++){
        //     int power = heroes[i];
        //     int low = 0, high = monsters.length - 1;

        //     while(low <= high){
        //         int mid = low + (high - low)/2;

        //         if(monsters[mid] <= power){
        //             low = mid + 1;
        //         }
        //         else{
        //             high = mid - 1;
        //         }
        //     }

        //     if(low > 0){
        //         ans[i] = prefix[low - 1];
        //     }
        // }

        // return ans;
    }
}
