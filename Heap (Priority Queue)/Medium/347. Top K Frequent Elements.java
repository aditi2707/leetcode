class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> l = new ArrayList<>();
        int[] ans = new int[k];

        for(Integer i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }

        for(int i = 0; i <= nums.length; i++){
            l.add(new ArrayList<>());
        }
        for(Integer i: map.keySet()){
            l.get(map.get(i)).add(i);
        }

        for(int i = l.size() - 1; i >= 0; i--){
            if(l.get(i).size() != 0){
                while(l.get(i).size() > 0){
                    ans[k-1] = l.get(i).get(0);
                    k--;
                    l.get(i).remove(0);
                }
            }
            if(k == 0){
                break;
            }
        }

        return ans;












        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // Map<Integer, Integer> map = new HashMap<>();

        // for(Integer i: nums){
        //     if(!map.containsKey(i)){
        //         map.put(i, 1);
        //     }
        //     else{
        //         map.put(i, map.get(i) + 1);
        //     }
        // }

        // for(Integer i: map.keySet()){
        //     minHeap.add(new int[]{map.get(i), i});
        //     if(minHeap.size() > k){
        //         minHeap.poll();
        //     }
        // }

        // int[] ans = new int[minHeap.size()];

        // while(minHeap.size() > 0){
        //     ans[minHeap.size() - 1] = minHeap.poll()[1];
        // }

        // return ans;
    }
}
