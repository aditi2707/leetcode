class Solution {
    public String removeVowels(String s) {
        
        String ans = "";
        
        for(char c: s.toCharArray()){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                ans += c;
            }
        }

        return ans;
    }
}
