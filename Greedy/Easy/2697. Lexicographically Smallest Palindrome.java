class Solution {
    public String makeSmallestPalindrome(String s) {
        
        int i = 0, j = s.length()-1;

        char[] c = s.toCharArray();

        while(i < j){
            char chI = c[i];
            char chJ = c[j];

            if(chI != chJ){
                if(chI > chJ){
                    c[i] = chJ;
                }
                else{
                    c[j] = chI;
                }
            }

            i++;
            j--;
        }

        return new String(c);
    }
}
