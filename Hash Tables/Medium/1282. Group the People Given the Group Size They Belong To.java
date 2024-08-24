class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }    
            List<Integer> t = map.get(groupSizes[i]);
            t.add(i);
            map.put(groupSizes[i], t);
            if(map.get(groupSizes[i]).size() == groupSizes[i]){
                list.add(map.get(groupSizes[i]));
                map.put(groupSizes[i], new ArrayList<>());
            }
        }

        return list;
    }
}
