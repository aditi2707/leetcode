class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Time Complexity : O(n + m + 26)

        // Space Complexity : O(26)


        int[] freq = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            freq[ch - 'a']--;

            if(freq[ch - 'a'] < 0){
                return false;
            }
        }

        return true;








        
        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < magazine.length(); i++){
        //     char ch = magazine.charAt(i);

        //     if(!map.containsKey(ch)){
        //         map.put(ch, 1);
        //     }
        //     else{
        //         map.put(ch, map.get(ch) + 1);
        //     }
        // }

        // for(int i = 0; i < ransomNote.length(); i++){
        //     char ch = ransomNote.charAt(i);

        //     if(map.containsKey(ch)){
        //         map.put(ch, map.get(ch) - 1);
        //     }
        //     else{
        //         return false;
        //     }

        //     if(map.get(ch) == 0){
        //         map.remove(ch);
        //     }
        // }

        // return true;
    }
}
