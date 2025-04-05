class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

        // Time Complexity : O(5 * log n)
        // Insertion and deletion takes O(log n) time in a heap. So at max, 5 can
        // be expected in total.

        // Space Complexity : O(2 * n)

        
        maxHeap.add(num);

        if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){
            int poll = maxHeap.poll();
            minHeap.add(poll);
        }

        if(maxHeap.size() - minHeap.size() > 1){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size() - maxHeap.size() > 1){
            maxHeap.add(minHeap.poll());
        }

        return;
    }
    
    public double findMedian() {

        // Time Complexity : O(1)
        
        // Space Complexity : O(1)


        if(maxHeap.isEmpty() && minHeap.isEmpty()){
            return 0.0;
        }
        if(maxHeap.isEmpty()){
            return (double)minHeap.peek();
        }
        if(minHeap.isEmpty()){
            return (double)maxHeap.peek();
        }
        
        if((maxHeap.size() + minHeap.size()) % 2 == 0){
            return (double)((maxHeap.peek() + minHeap.peek())) / 2;
        }

        if(maxHeap.size() > minHeap.size()){
            return (double)maxHeap.peek();
        }

        return (double)minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
