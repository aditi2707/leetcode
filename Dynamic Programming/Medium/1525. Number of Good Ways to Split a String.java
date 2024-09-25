class Solution {

    public int numSplits(String s) {

        int[] left = new int[26];
        int[] right = new int[26];
        char[] arr = s.toCharArray();
        int good = 0;

        int lCount = 0, rCount = 0;

        for(int i = 0; i < arr.length; i++){
            left[arr[i] - 'a'] += 1;
            if(left[arr[i] - 'a'] == 1){
                lCount++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            right[arr[i] - 'a'] += 1;
            left[arr[i] - 'a'] -= 1;

            if(right[arr[i] - 'a'] == 1){
                rCount++;
            }
            if(left[arr[i] - 'a'] == 0){
                lCount--;
            }

            if(lCount == rCount){
                good++;
            }
        }

        return good;




        
        // int good = 0;
        // Map<Character, Integer> lMap = new HashMap<>();
        // Map<Character, Integer> rMap = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
            
        //     if(!lMap.containsKey(s.charAt(i))){
        //         lMap.put(s.charAt(i), 1);
        //     }
        //     else{
        //         lMap.put(s.charAt(i), lMap.get(s.charAt(i))+1);
        //     }
        // }

        // for(int i = 0; i < s.length(); i++){
            
        //     if(lMap.containsKey(s.charAt(i))){
        //         lMap.put(s.charAt(i), lMap.get(s.charAt(i))-1);
        //     }

        //     if(!rMap.containsKey(s.charAt(i))){
        //         rMap.put(s.charAt(i), 1);
        //     }
        //     else{
        //         rMap.put(s.charAt(i), rMap.get(s.charAt(i))+1);
        //     }

        //     if(lMap.get(s.charAt(i)) == 0){
        //         lMap.remove(s.charAt(i));
        //     }

        //     if(lMap.size() == rMap.size()){
        //         good++;
        //     }
        // }

        
        // return good;
    }
}
