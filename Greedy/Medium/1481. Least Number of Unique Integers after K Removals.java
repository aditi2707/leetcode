class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        // Time Complexity : O(3n + nlog n). 
        //The first for loop will run for the entirety of the array, so that would 
        // be O(length_array). The second for loop will run for the map size, but in 
        // the worst case, the array can have no duplicates, so the map will have
        // size = array_length. The time complexity here will be O(length_array). 
        // The sorting will take nlog n TC. The last for loop will run for 
        // O(freq_array_length) but this too can have all unique characeters, so the
        // TC will be same here as well. Considering as n, the time complexity is
        // O(3n + nlog n).

        // Space Complexity : O(2n) if we consider the above assumption for map and
        // freq array.

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        int[] freq = new int[map.size()];
        int ind = 0;

        for(Integer i: map.keySet()){
            freq[ind] = map.get(i);
            ind++;
        }

        Arrays.sort(freq);

        for(int i = 0; i < freq.length; i++){
            if(k - freq[i] < 0){
                return freq.length - i;
            }
            else{
                k -= freq[i];
            }
        }

        return 0;



        // // Time Complexity : O(n + nlog n + min(k, n)). 
        // // The first for loop will run for the entirety of the array, so that would 
        // // be O(length_array). The second for loop will run for the map size, but in 
        // // the worst case, the array can have no duplicates, so the map will have
        // // size = array_length. Plus, the heap accumulation takes O(log n). The time
        // // complexity here will be O(length_array + length_array(log length_array)). 
        // // The last for loop will run for O(min(k, minHeap_size)) because if 
        // // k = 0, then it will break or the heap can also become empty.

        // // Space Complexity : O(2n) if we consider the above assumption for map and
        // // heap.

        
        // Map<Integer, Integer> map = new HashMap<>();

        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // for(int i = 0; i < arr.length; i++){
        //     if(!map.containsKey(arr[i])){
        //         map.put(arr[i], 1);
        //     }
        //     else{
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     }
        // }

        // for(Integer i: map.keySet()){
        //     minHeap.add(new int[]{map.get(i), i});
        // }

        // while(k > 0 && minHeap.size() > 0){
        //     int[] poll = minHeap.poll();
        //     poll[0] -= 1;

        //     if(poll[0] != 0){
        //         minHeap.add(poll);
        //     }
        //     k--;
        // }

        // return minHeap.size();
    }
}
