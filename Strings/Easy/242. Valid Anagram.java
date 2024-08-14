class Solution {
    public boolean isAnagram(String s, String t) {

        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // s = new String(sArr);
        // t = new String(tArr);

        // if(s.equals(t)){
        //     return true;
        // }
        // return false;

        
        
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;



        // HashMap<Character, Integer> map = new HashMap<>();

        // if(s.length() != t.length()){
        //     return false;
        // }

        // for(int i = 0; i < s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), 1);
        //     }
        //     else{
        //         map.put(s.charAt(i), map.get(s.charAt(i))+1);
        //     }
        // }

        // for(int i = 0; i < t.length(); i++){
        //     if(!map.containsKey(t.charAt(i))){
        //         return false;
        //     }
        //     else{
        //         if(map.get(t.charAt(i)) == 0){
        //             return false;
        //         }
        //         else{
        //             map.put(t.charAt(i), map.get(t.charAt(i))-1);
        //         }
        //     }
        // }

        // return true;
        
    }
}
