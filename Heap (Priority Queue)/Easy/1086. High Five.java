class Solution {
    public int[][] highFive(int[][] items) {

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int i = 0; i < items.length; i++){
            if(!map.containsKey(items[i][0])){
                map.put(items[i][0], new PriorityQueue<>());
            }
            map.get(items[i][0]).add(items[i][1]);

            if(map.get(items[i][0]).size() > 5){
                map.get(items[i][0]).poll();
            }
        }

        int[][] ans = new int[map.size()][2];
        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            int sum = 0;
            int id = list.get(i);
            while(map.get(id).size() > 0){
                sum += map.get(id).poll();
            }
            ans[i][0] = id;
            ans[i][1] = sum / 5;
        }

        return ans;




        
        // Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // for(int i = 0; i < items.length; i++){
        //     if(!map.containsKey(items[i][0])){
        //         map.put(items[i][0], new PriorityQueue<>());
        //     }
        //     map.get(items[i][0]).add(items[i][1]);

        //     if(map.get(items[i][0]).size() > 5){
        //         map.get(items[i][0]).poll();
        //     }
        // }

        // int[][] ans = new int[map.size()][2];
        // int k = 0;

        // for(Integer i: map.keySet()){
        //     int sum = 0;
        //     while(map.get(i).size() > 0){
        //         sum += map.get(i).poll();
        //     }
        //     ans[k][0] = i;
        //     ans[k][1] = sum / 5;

        //     k++;
        // }

        // Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));

        // return ans;
    }
}
