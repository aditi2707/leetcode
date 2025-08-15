class Solution {
    public int numOfStrings(String[] patterns, String word) {

        // Time Complexity : O(patterns.length * word.length())

        // Space Complexity : O(1)
        
        
        int ans = 0;

        for(String s: patterns){
            if(word.indexOf(s) != -1){
                ans++;
            }
        }

        return ans;
    }
}
