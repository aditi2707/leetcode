class Solution {
    public int appendCharacters(String s, String t) {

        // Time Complexity : O(s.length())

        // Space Complexity : O(1)
        
        
        int i = 0, j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        if(j < t.length()){
            return t.length() - j;
        }

        return 0;
    }
}
