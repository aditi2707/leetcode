class MovingAverage {

    Queue<Integer> queue;
    int sum = 0;
    int size;

    public MovingAverage(int size) {
        queue = new LinkedList<>();
        this.size = size;
    }
    
    public double next(int val) {
        
        sum += val;
        queue.add(val);
        double ans = 0.0;

        if(queue.size() > size){
            sum -= queue.poll();   
        }
       
        ans = (double)sum / queue.size();
        return ans;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
