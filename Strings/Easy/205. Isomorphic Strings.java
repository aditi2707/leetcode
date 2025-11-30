class Solution {
    public boolean isIsomorphic(String s, String t) {

        // Time Complexity : O(n)

        // Space Complexity : O(256 * 2)
        
        
        int[] sArr = new int[256];
        int[] tArr = new int[256];

        for(int i = 0; i < s.length(); i++){
            char chA = s.charAt(i);
            char chB = t.charAt(i);

            if(sArr[chA] == 0 && tArr[chB] == 0){
                sArr[chA] = chB;
                tArr[chB] = chA;
            }
            else if(sArr[chA] != chB || tArr[chB] != chA){
                return false;
            }
        }

        return true;




        
        
        // int[] sArr = new int[127];
        // int[] tArr = new int[127];

        // for(int i = 0; i < s.length(); i++){
            
        //     if(sArr[s.charAt(i)] != tArr[t.charAt(i)]){
        //         return false;
        //     }

        //     sArr[s.charAt(i)] = i+1;
        //     tArr[t.charAt(i)] = i+1;
        // }

        
        

        // for(int i = 0; i < s.length(); i++){
        //     String strS = s.substring(0, i);
        //     String strT = t.substring(0, i);

        //     if(strS.indexOf(s.charAt(i)) != -1){
        //         int indexS = strS.indexOf(s.charAt(i));
        //         if(t.charAt(indexS) != t.charAt(i)){
        //             return false;
        //         }
        //     }
        //     if(strT.indexOf(t.charAt(i)) != -1){
        //         int indexT = strT.indexOf(t.charAt(i));
        //         if(s.charAt(indexT) != s.charAt(i)){
        //             return false;
        //         }
        //     }
        // }

        
        //HashMap<Character, Character> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         if(map.containsValue(t.charAt(i))){
        //             return false;
        //         }
        //         map.put(s.charAt(i), t.charAt(i));
        //     }
        //     else{
        //         if(map.get(s.charAt(i)) != t.charAt(i)){
        //             return false;
        //         }
        //     }
        // }

        return true;
    }
}
