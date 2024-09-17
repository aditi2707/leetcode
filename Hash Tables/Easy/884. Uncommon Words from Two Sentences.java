class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int size = 0;

        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");

        for(String s: s1Arr){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, 0);
            }
        }

        for(String s: s2Arr){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, 0);
            }
        }

        for(String s: map.keySet()){
            if(map.get(s) == 1){
                size++;
            }
        }

        String[] ans = new String[size];
        int k = 0;
        for(String s: map.keySet()){
            if(map.get(s) == 1){
                ans[k] = s;
                k++;
            }
        }

        return ans;
    }
}
