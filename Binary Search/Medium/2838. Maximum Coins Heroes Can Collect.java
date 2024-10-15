class Solution {
    public long[] maximumCoins(int[] heroes, int[] monsters, int[] coins) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        long[] ans = new long[heroes.length];
        long[] prefix = new long[monsters.length];

        for(int i = 0; i < monsters.length; i++){
            minHeap.add(new int[]{monsters[i], coins[i]});
        }

        for(int i = 0; i < monsters.length; i++){
            int[] arr = minHeap.poll();
            monsters[i] = arr[0];
            coins[i] = arr[1];

            if(i == 0){
                prefix[i] = coins[i];
            }
            else{
                prefix[i] = prefix[i-1] + coins[i];
            }
        }

        for(int i = 0; i < heroes.length; i++){
            int power = heroes[i];
            int low = 0, high = monsters.length - 1;

            while(low <= high){
                int mid = low + (high - low)/2;

                if(monsters[mid] <= power){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(low > 0){
                ans[i] = prefix[low - 1];
            }
        }

        return ans;
    }
}
