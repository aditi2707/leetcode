class Solution {
    public boolean isValid(String word) {

        // Time Complexity : O(2n). For Character functions here, time complexity is
        // O(1) and for indexOf function, it is O(n). So 2n in total.
        
        // Space Complexity : O(1)
      

        if(word.length() < 3){
            return false;
        }
        
        int vowel = 0;
        int consonant = 0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(!Character.isLetterOrDigit(i)){
                return false;
            }

            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            
        }

        return (consonant == 0 || vowel == 0)? false : true;
    }
}
