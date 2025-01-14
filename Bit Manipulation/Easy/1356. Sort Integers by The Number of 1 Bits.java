class Solution {
    public int[] sortByBits(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] % 10001;
        }

        return arr;




        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // int[] ans = new int[arr.length];
        // int k = 0;

        // for(int i = 0; i < arr.length; i++){
        //     minHeap.add(new int[]{Integer.bitCount(arr[i]), arr[i]});
        // }

        // while(minHeap.size() > 0){
        //     ans[k] = minHeap.poll()[1];
        //     k++;
        // }

        // return ans;
    }
}
