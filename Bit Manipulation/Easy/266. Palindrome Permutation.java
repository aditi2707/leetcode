class Solution {
    public boolean canPermutePalindrome(String s) {

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int one = 0;

        for(int i = 0; i < 26; i++){
            if(freq[i] % 2 != 0){
                if(one > 0){
                    return false;
                }
                one++;
            }
        }

        return true;






        
        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), 1);
        //     }
        //     else{
        //         map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        //     }
        // }

        // int one = 0;

        // for(Character c: map.keySet()){
        //     int p = map.get(c);

        //     if(p % 2 == 0){
        //         map.put(c, 0);
        //     }
        //     else{
        //         if(one > 0){
        //             return false;
        //         }
        //         map.put(c, 1);
        //         one++;
        //     }
        // }

        // return true;
    }
}
