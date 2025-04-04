class Solution {
    public String reverseWords(String s) {

        // Time complexity : O(n)

        // Space Complexity : O(n) (for output string)


        String ans = "";
        String word = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(!word.equals("")){
                    ans = word + " " + ans;
                    word = "";
                }
                continue;
            }
            else{
                word += ch;
            }
        }

        if(!word.equals("")){
            ans = word + " " + ans;
        }

        return ans.trim();


        // // Time Complexity : O(n)
        
        // // Space Complexity : O(n + n) (for output string)

        
        // String ans = "";
        // List<String> list = new ArrayList<>();
        // String word = "";

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == ' '){
        //         if(!word.equals("")){
        //             list.add(word);
        //             word = "";
        //         }
        //         continue;
        //     }
        //     else{
        //         word += ch;
        //     }
        // }

        // if(!word.equals("")){
        //     list.add(word);
        // }
        
        // for(String i: list){
        //     ans = i + " " + ans;
        // }

        // return ans.trim();
        
    }
}
