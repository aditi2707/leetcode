class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            String substr = words[i];
            for(int j = 0; j < words.length; j++){
                if(words[j].indexOf(substr) != -1 && i != j){
                    ans.add(substr);
                    break;
                }
            }
        }

        return ans;
    }
}
