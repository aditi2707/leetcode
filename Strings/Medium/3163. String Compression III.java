class Solution {
    public String compressedString(String word) {
        
        String ans = "";
        int i = 0;

        while(i < word.length()){
            char ch = word.charAt(i);
            int j = i + 1;

            while(j < word.length() && word.charAt(j) == word.charAt(i) && j - i < 9){
                j++;
            }

            ans += String.valueOf(j - i) + ch;
            i = j;
        }

        return ans;
    }
}
