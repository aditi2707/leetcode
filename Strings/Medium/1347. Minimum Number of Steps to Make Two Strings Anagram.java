class Solution {
    public int minSteps(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int steps = 0;

        int[] arr = new int[26];

        for(int i = 0; i < sArr.length; i++){
            arr[sArr[i] - 'a']++;
            arr[tArr[i] - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] > 0){
                steps += arr[i];
            }
        }

        return steps;
        
        // HashMap<Character, Integer> tMap = new HashMap<>();
        // int steps = 0;

        // for(int i = 0; i < t.length(); i++){
        //     char ch = t.charAt(i);

        //     if(!tMap.containsKey(ch)){
        //         tMap.put(ch, 1);
        //     }
        //     else{
        //         tMap.put(ch, tMap.get(ch)+1);
        //     }
        // }

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(tMap.containsKey(ch)){
        //         if(tMap.get(ch) > 0){
        //             tMap.put(ch, tMap.get(ch)-1);
        //         }
        //         else{
        //             steps++;
        //         }
        //     }
        //     else{
        //         steps++;
        //     }
        // }

        // return steps;
    }
}
