class Solution {
    public long numberOfSubstrings(String s) {

        long count = 0;
        long[] freq = new long[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(Long i: freq){
            count += (i * (i-1))/2 + i;
        }

        return count;






        
        // long count = 0;
        // Map<Character, Long> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), (long)1);
        //     }
        //     else{
        //         map.put(s.charAt(i), (long)map.get(s.charAt(i)) + 1);
        //     }
        // }

        // for(Long i: map.values()){
        //     if(i > 1){
        //         count += (i * (i-1)) / 2;
        //     }
        // }

        // return count + s.length();
    }
}
