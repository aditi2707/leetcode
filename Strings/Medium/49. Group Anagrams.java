class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Time Complexity : O(m * (n + (26 * 2)))

        // Space Complexity : O(m * 2 + 26)

        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        int[] freq = new int[26];

        for(String s: strs){
            Arrays.fill(freq, 0);
            for(char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < 26; i++){
                temp.append(freq[i]);
                temp.append("#");
            }

            if(!map.containsKey(new String(temp))){
                map.put(new String(temp), new ArrayList<>());
            }
            map.get(new String(temp)).add(s);
        }

        for(List<String> list: map.values()){
            ans.add(list);
        }

        return ans;



        // // Time Complexity : O(m * nlog n + m) (where m = length of array and 
        // // n = average length of each string).

        // // Space Complexity : O(m * 2)

        
        // Map<String, List<String>> map = new HashMap<>();
        // List<List<String>> ans = new ArrayList<>();

        // for(String s: strs){
        //     char[] c = s.toCharArray();
        //     Arrays.sort(c);
        //     String sort = new String(c);

        //     if(!map.containsKey(sort)){
        //         map.put(sort, new ArrayList<>());
        //     }
        //     map.get(sort).add(s);
        // }

        // for(List<String> list: map.values()){
        //     ans.add(list);
        // }

        // return ans;
    }
}
