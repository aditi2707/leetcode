class Solution {
    public int maximumLengthSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        int i = 0, j = 0;

        while(j < s.length()){

            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), 1);
            }
            else if(map.get(s.charAt(j)) < 2){
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            }
            else{
                while(map.get(s.charAt(j)) == 2){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    i++;
                }
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                
            }
            ans = Math.max(ans, (j - i + 1));
            j++;
        }

        return ans;
    }
}
