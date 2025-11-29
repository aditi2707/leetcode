class Solution {
    public int lengthOfLastWord(String s) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int i = s.length() - 1;
        int end = -1;

        while(i >= 0){
            if(s.charAt(i) == ' '){
                i--;
            }
            else{
                end = i;
                break;
            }
        }

        while(i >= 0){
            if(s.charAt(i) == ' '){
                break;
            }
            else{
                i--;
            }
        }

        return end - i;
    }
}
