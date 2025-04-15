class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Time Complexity : O(n)
        // It would seem like there are two nested while loops, but in reality, one
        // window of fixed size is moving for each character. Hence the TC is linear.

        // Space Complexity : O(n)
        // In the worst case, the set can have all characters.
        

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                max = Math.max(max, set.size());
                while(i < j && set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
                j++;
            }
        }

        return Math.max(max, set.size()); 
    }
}
