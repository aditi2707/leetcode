class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        // Time Complexity : O(n * 26)

        // Space Complexity : O(n)
        
        
        String[] words = text.split(" ");
        int count = 0;

        for(String s: words){
            int flag = 0;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(brokenLetters.indexOf(ch) != -1){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                count++;
            }
        }

        return count;
    }
}
