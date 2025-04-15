class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // Time Complexity : O(s1.length() + 26 + s2.length())
        // The code is self-explanatory.

        // Space Complexity : O(26 * 2)
        // The two arrays are storing frequencies of characters of each string.


        if(s1.length() > s2.length()){
            return false;
        }
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int matches = 0;

        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq1[i] == freq2[i]){
                matches++;
            }
        }

        int i = 0, j = s1.length();
        
        while(j < s2.length()){
            if(matches == 26){
                return true;
            }

            freq2[s2.charAt(i) - 'a']--;
            if(freq1[s2.charAt(i) - 'a'] == freq2[s2.charAt(i) - 'a']){
                matches++;
            }
            else if(freq1[s2.charAt(i) - 'a'] - 1 == freq2[s2.charAt(i) - 'a']){
                matches--;
            }
            i++;

            freq2[s2.charAt(j) - 'a']++;
            if(freq1[s2.charAt(j) - 'a'] == freq2[s2.charAt(j) - 'a']){
                matches++;
            }
            else if(freq1[s2.charAt(j) - 'a'] + 1 == freq2[s2.charAt(j) - 'a']){
                matches--;
            }
            j++;
        }

        return matches == 26;
    }
}
