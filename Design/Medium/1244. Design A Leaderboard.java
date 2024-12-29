class Leaderboard {

    Map<Integer, Integer> map;

    public Leaderboard() {

        map = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        
        if(!map.containsKey(playerId)){
            map.put(playerId, score);
        }
        else{
            map.put(playerId, map.get(playerId) + score);
        }

        return;
    }
    
    public int top(int K) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int sum = 0;

        for(Integer i: map.values()){
            minHeap.add(i);
            if(minHeap.size() > K){
                minHeap.poll();
            }
        }

        while(minHeap.size() > 0){
            sum += minHeap.poll();
        }

        return sum;
    }
    
    public void reset(int playerId) {
        
        map.remove(playerId);

        return;
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
