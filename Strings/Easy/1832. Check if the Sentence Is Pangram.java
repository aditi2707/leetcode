class Solution {
    public boolean checkIfPangram(String sentence) {

        // Time Complexity : O(n + 26)

        // Space Complexity : O(26)

        
        int[] freq = new int[26];

        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }

        for(Integer i: freq){
            if(i == 0){
                return false;
            }
        }

        return true;
    }
}
