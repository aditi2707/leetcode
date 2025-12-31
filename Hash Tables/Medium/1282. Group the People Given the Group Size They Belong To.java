class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }

        int index = 0;

        for(Integer g: map.keySet()){
            List<Integer> l = map.get(g);
            int count = 0;
            for(int i = 0; i < l.size(); i++){
                if(count == 0){
                    ans.add(new ArrayList<>());
                }
                ans.get(index).add(l.get(i));
                count++;

                if(count == g){
                    index++;
                    count = 0;
                }
            }
        }

        return ans;




        
        
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
