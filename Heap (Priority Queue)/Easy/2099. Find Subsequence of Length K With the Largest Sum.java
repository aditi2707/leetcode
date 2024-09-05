class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> (a[0]-b[0]));
        PriorityQueue<int[]> minHeapInd = new PriorityQueue<>((a,b)-> (a[0]-b[0]));
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++){
            minHeap.add(new int[]{nums[i], i});
            map.put(i, nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        while(minHeap.size() > 0){
            int[] t = minHeap.poll();
            minHeapInd.add(new int[]{t[1], t[0]});
        }

        for(int i = 0; i < k; i++){
            ans[i] = minHeapInd.poll()[1];
        }

        return ans;
    }
}
