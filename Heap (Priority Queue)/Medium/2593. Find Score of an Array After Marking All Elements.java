class Solution {
    public long findScore(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        long score = 0;

        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
            minHeap.add(new int[]{nums[i], i});
        }

        while(minHeap.size() > 0){
            int[] poll = minHeap.poll();

            if(map.containsKey(poll[1])){
                score += poll[0];
                if(poll[1] - 1 >= 0){
                    map.remove(poll[1] - 1);
                }
                if(poll[1] + 1 < nums.length){
                    map.remove(poll[1] + 1);
                }
                map.remove(poll[1]);
            }
        }

        for(Integer i: map.keySet()){
            score += map.get(i);
        }

        return score;
    }
}
