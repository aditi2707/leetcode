class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer i: stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if(x != y){
                maxHeap.add(Math.abs(x - y));
            }
        }

        if(maxHeap.size() == 1){
            return maxHeap.poll();
        }
            
        return 0;
    }
}
