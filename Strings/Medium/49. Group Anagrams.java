class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            if(!map.containsKey(b)){
                map.put(b, new ArrayList<>());
            }
            map.get(b).add(strs[i]);
            
        }
        
        // for(String s: map.keySet()){
        //     ans.add(map.get(s));
        // }
        return new ArrayList<>(map.values());
    }
}
