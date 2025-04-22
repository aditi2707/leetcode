class FreqStack {

    Map<Integer, Stack<Integer>> map;
    Map<Integer, Integer> freq;
    int max = 0;

    public FreqStack() {

        // Space Complexity : O(n * 2)


        map = new HashMap<>();
        freq = new HashMap<>();
    }
    
    public void push(int val) {

        // Time Complexity : O(1)


        if(freq.containsKey(val)){
            int ind = freq.get(val);
            if(!map.containsKey(ind + 1)){
                map.put(ind + 1, new Stack<>());
            }
            map.get(ind + 1).push(val);
            max = Math.max(max, ind + 1);
            freq.put(val, ind + 1);
        }
        else{
            if(map.isEmpty()){
                map.put(1, new Stack<>());
            }
            map.get(1).push(val);
            freq.put(val, 1);
            max = Math.max(max, 1);
        }

        return;
    }
    
    public int pop() {
        
        // Time Complexity : O(1)
        
        
        int pop = map.get(max).pop();
        freq.put(pop, freq.get(pop) - 1);
        if(map.get(max).size() == 0){
            map.remove(max);
            max--;
        }

        return pop;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
