class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long gift = 0;

        for(int i = 0; i < gifts.length; i++){
            maxHeap.add((long)gifts[i]);
        }

        int c = 1;
        while(c <= k){
            long p = maxHeap.poll();
            p = (long)Math.sqrt(p);
            maxHeap.add(p);

            c++;
        }

        while(maxHeap.size() > 0){
            gift += maxHeap.poll();
        }

        return gift;
    }
}
