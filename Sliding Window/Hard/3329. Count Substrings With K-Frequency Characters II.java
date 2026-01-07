class Solution {
    public long numberOfSubstrings(String s, int k) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(26)
        
        
        int[] freq = new int[26];

        int i = 0, j = 0;
        long count = 0;
        int max = 0;

        while(j < s.length()){
            
            freq[s.charAt(j) - 'a'] += 1;

            max = Math.max(max, freq[s.charAt(j) - 'a']);

            if(max == k){
                while(i <= j && freq[s.charAt(j) - 'a'] >= k){
                    count += (long)(s.length() - j);
                    freq[s.charAt(i) - 'a'] -= 1;
                    i++;
                }
            }
            
            j++;
        }

        return count;







        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n)

        
        // Map<Character, Integer> map = new HashMap<>();

        // int i = 0, j = 0;
        // long count = 0;
        // int max = 0;

        // while(j < s.length()){
        //     if(!map.containsKey(s.charAt(j))){
        //         map.put(s.charAt(j), 1);
        //     }
        //     else{
        //         map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
        //     }
        //     max = Math.max(max, map.get(s.charAt(j)));

        //     if(max == k){
        //         while(i <= j && map.get(s.charAt(j)) >= k){
        //             count += (long)(s.length() - j);
        //             map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        //             i++;
        //         }
        //         j++;
        //     }
        //     else{
        //         j++;
        //     }
        // }

        // return count;
    }
}
