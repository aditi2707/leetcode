class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }

        for(List<String> l: map.values()){
            ans.add(l);
        }

        return ans;








        // List<List<String>> ans = new ArrayList<>();
        // Map<String, List<String>> map = new HashMap<>();

        // for(int i = 0; i < strs.length; i++){
        //     int[] arr = new int[26];
        //     String temp = "";

        //     for(int j = 0; j < strs[i].length(); j++){
        //         arr[strs[i].charAt(j) - 'a']++;
        //     }
        //     for(int j = 0; j < 26; j++){
        //         temp += "#" + String.valueOf(arr[j]);
        //     }
            
        //     if(!map.containsKey(temp)){
        //         map.put(temp, new ArrayList<>());
        //     }
        //     map.get(temp).add(strs[i]);
        // }

        // for(List<String> l: map.values()){
        //     ans.add(l);
        // }

        // return ans;

    }
}
