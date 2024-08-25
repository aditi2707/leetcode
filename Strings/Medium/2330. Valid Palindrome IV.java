class Solution {
    public boolean makePalindrome(String s) {
        
        int counter = 0;
        int i = 0, j = s.length()-1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                counter++;
            }
            i++;
            j--;
            if(counter > 2){
                return false;
            }
        }

        return true;
    }
}
