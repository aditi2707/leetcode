class Solution {
    public String minWindow(String s, String t) {

        // Time Complexity : O(t.length() + s.length() + t.length())

        // Space Complexity : O(mapS.size() + mapT.size() + 3)
        

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        int[] arr = {-1, 0, 0};

        for(char c: t.toCharArray()){
            if(!mapT.containsKey(c)){
                mapT.put(c, 1);
            }
            else{
                mapT.put(c, mapT.get(c) + 1);
            }
        }

        int need = mapT.size();
        int have = 0;

        int i = 0, j = 0;

        while(j < s.length()){
            char ch = s.charAt(j);

            if(!mapS.containsKey(ch)){
                mapS.put(ch, 1);
            }
            else{
                mapS.put(ch, mapS.get(ch) + 1);
            }
            if(mapT.containsKey(ch) && mapS.get(ch).intValue() == mapT.get(ch).intValue()){
                have++;
            }
            while(i <= j && have == need){
                if(arr[0] == -1 || (j - i + 1) < arr[0]){
                    arr[0] = (j - i + 1);
                    arr[1] = i;
                    arr[2] = j;
                }
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) - 1);
                if(mapT.containsKey(s.charAt(i)) && 
                mapS.get(s.charAt(i)).intValue() < mapT.get(s.charAt(i)).intValue()){
                    have--;
                }

                i++;
            }

            j++;
        }

        return arr[0] == -1? "" : s.substring(arr[1], arr[2] + 1);
    }
}
