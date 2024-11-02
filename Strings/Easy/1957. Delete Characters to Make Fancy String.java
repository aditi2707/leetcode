class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        char prev = s.charAt(0);
        int freq = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == prev){
                freq++;
            }
            else{
                prev = s.charAt(i);
                freq = 1;
            }

            if(freq < 3){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
