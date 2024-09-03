class Solution {
    public int[][] highFive(int[][] items) {
        
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < items.length; i++){
            if(!map.containsKey(items[i][0])){
                map.put(items[i][0], new PriorityQueue<>());
                //map.put(items[i][0], new ArrayList<>());
            }
            map.get(items[i][0]).add(items[i][1]);
            if(map.get(items[i][0]).size() > 5){
                map.get(items[i][0]).poll();
            }
        }

        int[][] result = new int[map.size()][2];
        int k = 0;

        for(Integer i: map.keySet()){
            int sum = map.get(i).poll() + map.get(i).poll() + map.get(i).poll() + map.get(i).poll() + map.get(i).poll();
            int average = sum/5;
            result[k][0] = i;
            result[k][1] = average;
            k++;
        }

        // int k = 0;
        // for(Integer i: map.keySet()){
        //     int s = 0;
        //     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //     while(s < map.get(i).size()){
        //         minHeap.add(map.get(i).get(s));
        //         if(minHeap.size() > 5){
        //             minHeap.poll();
        //         }
        //         s++;
        //     }
        //     int sum = 0;
        //     while(minHeap.size() > 0){
        //         sum += minHeap.poll();
        //     }
        //     int average = sum/5;
        //     result[k][0] = i;
        //     result[k][1] = average;
        //     k++;
        // }

        Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));
        return result;
    }
}
