class Solution {

    private int compareTwo(Pair<Integer, String> a, Pair<Integer, String> b){

        return (a.getValue()).compareTo(b.getValue()) > 0? -1 : 1;
    }


    public List<String> topKFrequent(String[] words, int k) {

        // Time Complexity : O(n + nlog k + k + k)
        
        // Space Complexity : O(unique_words + k + k)
        

        PriorityQueue<Pair<Integer, String>> minHeap = new PriorityQueue<>((a, b) -> {
            return a.getKey() == b.getKey()? compareTwo(a, b) : a.getKey() - b.getKey();
        });
        List<String> ans = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(String s: words){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, map.get(s) + 1);
            }
        }

        for(String s: map.keySet()){
            minHeap.add(new Pair<>(map.get(s), s));
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        for(int i = 0; i < minHeap.size(); i++){
            ans.add("");
        }

        int i = ans.size() - 1;
        while(minHeap.size() > 0){
            ans.set(i, minHeap.poll().getValue());
            i--;
        }

        return ans;
    }
}
