class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        for(int i = 0; i < nums.length; i++){
            minHeap.add(new int[]{nums[i], i});
        }

        int counter = 0;
        while(counter < k){
            int j = minHeap.poll()[1];
            nums[j] *= multiplier;
            minHeap.add(new int[]{nums[j], j});
            counter++;
        }

        return nums;
    }
}
