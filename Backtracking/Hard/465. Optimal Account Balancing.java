class Solution {

    private int backtracking(List<Integer> list, int index){

        while (index < list.size() && list.get(index) == 0) {
            index++;
        }

        if(index == list.size()){
            return 0;
        }

        int min = Integer.MAX_VALUE / 2;

        for(int i = index + 1; i < list.size(); i++){
            if(list.get(index) * list.get(i) < 0){
                list.set(i, list.get(index) + list.get(i));
                min = Math.min(min, 1 + backtracking(list, index + 1));
                list.set(i, list.get(i) - list.get(index));
            }
        }

        return min;
    }


    public int minTransfers(int[][] transactions) {

        // Time Complexity : O(n + map_size + (n - 1)!)
        // Space Complexity : O(n + list_size + n)
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < transactions.length; i++){
            if(!map.containsKey(transactions[i][0])){
                map.put(transactions[i][0], 0);
            }
            if(!map.containsKey(transactions[i][1])){
                map.put(transactions[i][1], 0);
            }
            map.put(transactions[i][0], map.get(transactions[i][0]) - transactions[i][2]);
            map.put(transactions[i][1], map.get(transactions[i][1]) + transactions[i][2]);
        }

        for(Integer i: map.keySet()){
            if(map.get(i) != 0){
                list.add(map.get(i));
            }
        }

        return backtracking(list, 0);
    }
}
