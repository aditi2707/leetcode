class Solution {

    public List<String> alertNames(String[] keyName, String[] keyTime) {

        // Time Complexity : O(n + (n * (mlog m + m)))

        // Space Complexity : O(unique_names * 2)
        

        List<String> ans = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < keyName.length; i++){
            if(!map.containsKey(keyName[i])){
                map.put(keyName[i], new ArrayList<>());
            }
            int time = Integer.parseInt(keyTime[i].substring(0, 2)) * 60 + Integer.parseInt(keyTime[i].substring(3));
            map.get(keyName[i]).add(time);
        }

        for(String s: map.keySet()){
            Collections.sort(map.get(s));
            for(int i = 2; i < map.get(s).size(); i++){
                if(map.get(s).get(i) - map.get(s).get(i - 2) <= 60){
                    ans.add(s);
                    break;
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}
