class MovingAverage {

    Queue<Integer> queue;
    int size;
    int sum = 0;

    public MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList<>();
    }
    
    public double next(int val) {

        // Time Complexity : O(1)

        // Space Complexity : O(1)
        
        
        queue.add(val);

        if(queue.size() > size){
            sum -= queue.peek();
            queue.poll();
        }

        sum += val;

        return (double)sum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
