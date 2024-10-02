class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] ans = new int[arr.length];
        int[] temp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(Integer i: temp){
            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            ans[count] = map.get(arr[i]);
            count++;
        }

        return ans;







        
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // if(arr.length == 0){
        //     return new int[0];
        // }

        // int rank = 1;
        // int[] ans = new int[arr.length];

        // for(int i = 0; i < arr.length; i++){
        //     minHeap.add(new int[]{arr[i], i});
        // }

        // while(minHeap.size() > 1){
        //     int[] a = minHeap.poll();
        //     int ind = a[1];
        //     int num = a[0];

        //     int[] peek = minHeap.peek();
        //     int n = peek[0];

        //     if(num == n){
        //         ans[ind] = rank;
        //     }
        //     else{
        //         ans[ind] = rank;
        //         rank++;
        //     }
        // }

        // ans[minHeap.poll()[1]] = rank;

        // return ans;
    }
}
