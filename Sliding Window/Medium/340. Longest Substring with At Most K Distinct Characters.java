class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        // Time Complexity : O(n)

        // Space Complexity : O(k)
        
        
        int i = 0, j = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(j < s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), 1);
            }
            else{
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            }

            while(map.size() > k){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
            }

            ans = Math.max(ans, (j - i + 1));
            j++;
        }

        return ans;
    }
}
