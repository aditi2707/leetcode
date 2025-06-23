class Solution {

    private boolean checkPalin(String s, int i, int j){

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    public boolean validPalindrome(String s) {

        // Time Complexity : O(n / 2)

        // Space Complexity : O(1)

        
        int i = 0, j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return checkPalin(s, i + 1, j) || checkPalin(s, i, j - 1);
            }
            else{
                i++;
                j--;
            }
        }

        return true;
    }
}
