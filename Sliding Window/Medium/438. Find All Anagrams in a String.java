class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        // Time Complexity : O(p + (s * 2))

        // Space Complexity : O(26 * 2)


        List<Integer> ans = new ArrayList<>();

        int[] freqP = new int[26];

        for(char ch: p.toCharArray()){
            freqP[ch - 'a'] += 1;
        }

        int i = 0, j = 0;
        int[] freqS = new int[26];

        while(j < s.length()){

            char ch = s.charAt(j);

            if(freqP[ch - 'a'] > 0){
                freqS[ch - 'a'] += 1;

                while(freqS[ch - 'a'] > freqP[ch - 'a']){
                    freqS[s.charAt(i) - 'a'] -= 1;
                    i++;
                }

                if(Arrays.equals(freqS, freqP)){
                    ans.add(i);
                    freqS[s.charAt(i) - 'a'] -= 1;
                    i++;
                }

                j++;
            }
            else{
                while(i < j){
                    freqS[s.charAt(i) - 'a'] -= 1;
                    i++;
                }
                j++;
                i = j;
            }
        }

        return ans;






        // // Time Complexity : O(p + (s * 2))

        // // Space Complexity : O(p + s)

        
        // List<Integer> ans = new ArrayList<>();

        // Map<Character, Integer> map1 = new HashMap<>();

        // for(char ch: p.toCharArray()){
        //     if(!map1.containsKey(ch)){
        //         map1.put(ch, 1);
        //     }
        //     else{
        //         map1.put(ch, map1.get(ch) + 1);
        //     }
        // }

        // int i = 0, j = 0;
        // Map<Character, Integer> map2 = new HashMap<>();

        // while(j < s.length()){

        //     char ch = s.charAt(j);

        //     if(map1.containsKey(ch)){
        //         if(!map2.containsKey(ch)){
        //             map2.put(ch, 1);
        //         }
        //         else{
        //             map2.put(ch, map2.get(ch) + 1);
        //         }

        //         while(map2.get(ch) > map1.get(ch)){
        //             map2.put(s.charAt(i), map2.get(s.charAt(i)) - 1);
        //             i++;
        //         }

        //         if(map2.equals(map1)){
        //             ans.add(i);
        //             map2.put(s.charAt(i), map2.get(s.charAt(i)) - 1);
        //             i++;
        //         }

        //         j++;
        //     }
        //     else{
        //         while(i < j){
        //             map2.put(s.charAt(i), map2.get(s.charAt(i)) - 1);
        //             i++;
        //         }
        //         j++;
        //         i = j;
        //     }
        // }

        // return ans;
    }
}
