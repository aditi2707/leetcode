class Solution {
    public boolean wordPattern(String pattern, String s) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if(pattern.length() != arr.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(!map.containsValue(arr[i])){
                    map.put(c, arr[i]);
                }
                else{
                    return false;
                }
            }
            else{
                if(!map.get(c).equals(arr[i])){
                    return false;
                }
            }
        }

        return true;
    }
}
