class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            int flag = 0;
            HashMap<Character, Character> map = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);

                if(!map.containsKey(ch)){
                    if(!map.containsValue(pattern.charAt(j))){
                        map.put(ch, pattern.charAt(j));
                    }
                    else{
                        flag = 1;
                        break;
                    }
                }
                else{
                    if(map.get(ch) != pattern.charAt(j)){
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0){
                ans.add(words[i]);
            }
        }

        return ans;
    }
}
