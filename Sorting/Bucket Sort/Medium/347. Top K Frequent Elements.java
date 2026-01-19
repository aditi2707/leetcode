class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Time Complexity : O(n + max + n + k)

        // Space Complexity : O(n + n)
        

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(Integer i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
            max = Math.max(max, map.get(i));
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i <= max; i++){
            list.add(new ArrayList<>());
        }

        for(Integer i: map.keySet()){
            list.get(map.get(i)).add(i);
        }

        int[] ans = new int[k];
        int index = 0;

        for(int i = max; i >= 0; i--){
            for(Integer j: list.get(i)){
                ans[index] = j;
                index++;

                if(index == k){
                    break;
                }
            }

            if(index == k){
                break;
            }
        }

        return ans;







        // // Time Complexity : O(n + nlog k + k)

        // // Space Complexity : O(n + k)

        
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0]? a[1] - b[1] : a[0] - b[0];
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

        // int[] ans = new int[k];
        // int index = 0;

        // while(!minHeap.isEmpty()){
        //     ans[index] = minHeap.poll()[1];
        //     index++;
        // }

        // return ans;
    }
}
