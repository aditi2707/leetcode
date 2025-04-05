class Solution {
    public boolean isAnagram(String s, String t) {

        // Time Complexity : O((n * 2) + 26 + (n * 2))

        // Space Complexity : O(26)


        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c: t.toCharArray()){
            freq[c - 'a']--;
        }

        for(Integer i: freq){
            if(i != 0){
                return false;
            }
        }

        return true;




        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(26)


        // Map<Character, Integer> map = new HashMap<>();

        // for(char c: s.toCharArray()){
        //     if(!map.containsKey(c)){
        //         map.put(c, 1);
        //     }
        //     else{
        //         map.put(c, map.get(c) + 1);
        //     }
        // }

        // for(char c: t.toCharArray()){
        //     if(!map.containsKey(c)){
        //         return false;
        //     }
        //     else{
        //         map.put(c, map.get(c) - 1);
        //         if(map.get(c) == 0){
        //             map.remove(c);
        //         }
        //     }
        // }

        // return map.size() == 0;





        
        // // Time Complexity : O((nlog n) * 2 + (n * 2))

        // // Space Complexity : O(n * 2)


        // char[] c1 = s.toCharArray();
        // char[] c2 = t.toCharArray();

        // Arrays.sort(c1);
        // Arrays.sort(c2);

        // return String.valueOf(c1).equals(String.valueOf(c2));
    }
}
