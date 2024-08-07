class Solution {
    public int maxScore(String s) {
        int nZero = 0;
        int nOne = 0;
        int score = 0;
        int max = 0;


        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                nOne++;
            }
        }

        for(int i = 0; i < s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                nZero++;
            }
            else{
                nOne--;
            }
            score = nZero + nOne;
            max = Math.max(max, score);
        }

        return max;
    }
}
