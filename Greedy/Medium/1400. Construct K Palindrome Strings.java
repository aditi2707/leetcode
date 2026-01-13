class Solution {
    public boolean canConstruct(String s, int k) {

        // Time Complexity : O(n + n)

        // Space Complexity : O(n)


        if(s.length() < k){
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int odd = 0;

        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        }

        for(Integer i: map.values()){

            if(i % 2 == 1){
                odd++;
            }
        }

        if(odd > k){
            return false;
        }

        return true;
    }
}
