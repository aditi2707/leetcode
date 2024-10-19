class Solution {
    public int connectSticks(int[] sticks) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int cost = 0;

        for(Integer i: sticks){
            minHeap.add(i);
        }

        while(minHeap.size() > 1){
            int s1 = minHeap.poll();
            int s2 = minHeap.poll();

            cost += s1 + s2;

            minHeap.add(s1 + s2);
        }

        return cost;
    }
}
