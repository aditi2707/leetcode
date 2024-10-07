class Solution {
    public int longestPalindrome(String s) {

        Set<Character> set = new HashSet<>();
        int palin = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                set.remove(ch);
                palin++;
            }
            else{
                set.add(ch);
            }
        }

        if(set.size() != 0){
            return palin * 2 + 1;
        }

        return palin * 2;







        
        // Map<Character, Integer> map = new HashMap<>();
        // int palin = 0;

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(!map.containsKey(ch)){
        //         map.put(ch, 1);
        //     }
        //     else{
        //         map.put(ch, map.get(ch) + 1);
        //     }
        // }

        // for(Character c: map.keySet()){
        //     if(map.get(c) % 2 == 0){
        //         palin += map.get(c);
        //     }
        //     else if(map.get(c) % 2 != 0){
        //         palin += map.get(c) - 1;
        //     }
        // }

        // if(s.length() - palin != 0){
        //     palin++;
        // }

        // return palin;
    }
}
