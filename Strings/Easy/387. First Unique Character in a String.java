class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;



        
        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(!map.containsKey(ch)){
        //         map.put(ch, 1);
        //     }
        //     else{
        //         map.put(ch, map.get(ch) + 1);
        //     }
        // }

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(map.get(ch) == 1){
        //         return i;
        //     }
        // }

        // return -1;
    }
}
