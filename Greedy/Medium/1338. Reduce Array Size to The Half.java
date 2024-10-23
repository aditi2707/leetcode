class Solution {
    public int minSetSize(int[] arr) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
        int minSize = 0;
        int half = arr.length/2;
        int sum = 0;

        for(Integer i: arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }

        for(Integer i: map.keySet()){
            minHeap.add(map.get(i));
        }

        while(minHeap.size() > 0){
            sum += minHeap.poll();
            minSize++;
            if(sum >= half){
                return minSize;
            }
        }

        return minSize;
    }
}
