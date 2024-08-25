class Solution {

    public int subseq(String s, String t, int m, int n){
        
        if(m == 0 || n == 0){
            return 0;
        }
        // if(n == 0){
        //     return 0;
        // }
        // if(m == 0){
        //     return 1;
        // }

        if(s.charAt(m-1) == t.charAt(n-1)){
            return 1 + subseq(s, t, m-1, n-1);
        }
        else{
            return subseq(s, t, m, n-1);
        }
        
    }
    public boolean isSubsequence(String s, String t) {

        if(subseq(s, t, s.length(), t.length()) == s.length()){
            return true;
        }
        return false;
    }
}
