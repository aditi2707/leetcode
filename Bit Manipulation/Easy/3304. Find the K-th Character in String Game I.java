class Solution {
    public char kthCharacter(int k) {
        
        char ans = '\0';
        String word = "a";

        while(word.length() <= k){

            String gen = "";
            for(int i = 0; i < word.length(); i++){
                gen += (char)((int)(word.charAt(i)) + 1);
            }

            word += gen;
        }

        return word.charAt(k - 1);
    }
}
