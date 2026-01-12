class HitCounter {

    Queue<Integer> queue;

    // Map<Integer, Integer> map;
    // int counter = 0;

    // List<Integer> hits;

    public HitCounter() {

        queue = new LinkedList<>();

        // map = new HashMap<>();

        // hits = new ArrayList<>();
    }
    
    public void hit(int timestamp) {

        queue.add(timestamp);
        return;


        // map.put(counter, timestamp);
        // counter++;

        // return;
        


        // hits.add(timestamp);
        // return;
    }
    
    public int getHits(int timestamp) {

        if(timestamp - 300 <= 0){
            return queue.size();
        }

        int lower = timestamp - 300;

        while(!queue.isEmpty() && queue.peek() <= lower){
            queue.poll();
        }

        return queue.size();




        // Time Complexity : O(log n)


        int low = 0, high = counter.size() - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(counter.get(mid) <= timestamp - 300){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return counter.size() - low;





        // if(timestamp - 300 <= 0){
        //     return map.size();
        // }

        // int lower = timestamp - 300;

        // for(int i = 0; i < counter; i++){
        //     if(map.get(i) > lower){
        //         return counter - i;
        //     }
        // }

        // return 0;



        
        // if(timestamp - 300 <= 0){
        //     return hits.size();
        // }

        // int lower = timestamp - 300;

        // for(int i = 0; i < hits.size(); i++){
        //     if(hits.get(i) > lower){
        //         return hits.size() - i;
        //     }
        // }

        // return 0;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
