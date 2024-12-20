class RecentCounter {

    List<Integer> counter = new ArrayList<>();
    int index;

    public RecentCounter() {
        index = 0;
    }
    
    public int ping(int t) {

        counter.add(t);
        
        int lower = index;
        int upper = counter.size() - 1;

        for(int i = index; i < counter.size(); i++){
            if(counter.get(i) >= (t - 3000)){
                lower = i;
                break;
            }
        }
        // for(int i = counter.size() - 1; i >= 0; i--){
        //     if(counter.get(i) <= t){
        //         upper = i;
        //         break;
        //     }
        // }

        index = lower;
        return upper - lower + 1;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
