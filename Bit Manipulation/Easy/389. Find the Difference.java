class Solution {
    public char findTheDifference(String s, String t) {

        char result = 0;

        for(Character c: s.toCharArray()){
            result ^= c;
        }

        for(Character c: t.toCharArray()){
            result ^= c;
        }

        return result;





        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // for(int i = 0; i < sArr.length; i++){
        //     if(sArr[i] != tArr[i]){
        //         return tArr[i];
        //     }
        // }

        // return tArr[tArr.length - 1];





        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), 1);
        //     }
        //     else{
        //         map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        //     }
        // }
        
        // for(int i = 0; i < t.length(); i++){
        //     if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0){
        //         return t.charAt(i);
        //     }
        //     map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        // }

        // return '\0';
    }
}
