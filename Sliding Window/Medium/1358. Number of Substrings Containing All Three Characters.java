class Solution {
    public int numberOfSubstrings(String s) {
        
        int i = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        while(j < s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), 1);
            }
            else{
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            }

            if(map.size() < 3){
                j++;
            }
            else{
                while(map.size() == 3 && i <= j){
                    count += s.length() - j;
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        return count;
    }
}
