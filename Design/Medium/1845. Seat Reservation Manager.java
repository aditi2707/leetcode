class SeatManager {

    int c = 1;
    PriorityQueue<Integer> minHeap;

    // Set<Integer> set;
    // PriorityQueue<Integer> minHeap;

    public SeatManager(int n) {

        minHeap = new PriorityQueue<>();

        // set = new HashSet<>();
        // minHeap = new PriorityQueue<>();


        // for(int i = 1; i <= n; i++){
        //     set.add(i);
        //     minHeap.add(i);
        // }
    }
    
    public int reserve() {

        if(!minHeap.isEmpty()){
            return minHeap.poll();
        }

        c++;
        return c - 1;
        
        // int poll = minHeap.poll();
        // set.remove(poll);

        // return poll;
    }
    
    public void unreserve(int seatNumber) {

        minHeap.add(seatNumber);

        return;

        // minHeap.add(seatNumber);
        // set.add(seatNumber);

        // return;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
