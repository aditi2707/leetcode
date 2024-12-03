class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        Map<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[nums.length - k + 1];
        int i = 0, j = 0, ind = 0;

        while(j < nums.length){
            if((j - i + 1) <= k){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j], 1);
                }
                else{
                    map.put(nums[j], map.get(nums[j]) + 1);
                }
                j++;
            }
            else{
                
                for(Integer p: map.keySet()){
                    minHeap.add(new int[]{map.get(p), p});
                    if(minHeap.size() > x){
                        minHeap.poll();
                    }
                }
                while(minHeap.size() > 0){
                    int[] poll = minHeap.poll();
                    ans[ind] += poll[0] * poll[1];
                }

                map.put(nums[i], map.get(nums[i]) - 1);
                ind++;
                i++;

                if(j < nums.length){
                    if(!map.containsKey(nums[j])){
                        map.put(nums[j], 1);
                    }
                    else{
                        map.put(nums[j], map.get(nums[j]) + 1);
                    }
                }

                j++;
            }
        }


        for(Integer p: map.keySet()){
            minHeap.add(new int[]{map.get(p), p});
            if(minHeap.size() > x){
                minHeap.poll();
            }
        }
        while(minHeap.size() > 0){
            int[] poll = minHeap.poll();
            ans[ind] += poll[0] * poll[1];
        }

        return ans;
    }
}
