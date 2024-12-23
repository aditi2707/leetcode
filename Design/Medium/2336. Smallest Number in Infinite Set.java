class SmallestInfiniteSet {

    int[] infiniteSet;

    // Set<Integer> set;
    // PriorityQueue<Integer> minHeap;

    public SmallestInfiniteSet() {

        infiniteSet = new int[1001];
        Arrays.fill(infiniteSet, 1);

        // set = new HashSet<>();
        // minHeap = new PriorityQueue<>();

        // for(int i = 1; i <= 1000; i++){
        //     set.add(i);
        //     minHeap.add(i);
        // }
    }
    
    public int popSmallest() {

        for(int i = 1; i <= 1000; i++){
            if(infiniteSet[i] == 1){
                infiniteSet[i] = 0;
                return i;
            }
        }

        return 0;
        
        
        // int poll = minHeap.poll();
        // set.remove(poll);

        // return poll;
    }
    
    public void addBack(int num) {

        if(infiniteSet[num] == 0){
            infiniteSet[num] = 1;
        }

        return;


        // if(!set.contains(num)){
        //     set.add(num);
        //     minHeap.add(num);
        // }

        // return;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
