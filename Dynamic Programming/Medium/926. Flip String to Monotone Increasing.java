class Solution {

    public int minFlipsMonoIncr(String s) {
        
        int ones = 0, ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                ans = Math.min(ans+1, ones);
            }
            else{
                ones++;
            }
        }

        return ans;
    }
}
