class Solution {
    public int numberOfSpecialSubstrings(String s) {
        
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            int j = i;
            String sub = "";

            while(j < s.length()){
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), 1);
                    count++;
                    sub += s.charAt(j);
                    j++;
                }
                else{
                    break;
                }
            }
        }

        return count;
    }
}
