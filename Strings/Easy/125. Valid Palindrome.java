class Solution {

    // public boolean findPalin(String ans){

    //     for(int i = 0; i < ans.length()/2; i++){
    //         if(ans.charAt(i) != ans.charAt(ans.length()-1-i)){
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    public boolean isPalindrome(String s) {

        // Time Complexity : O(n / 2)
        // The loop will terminate when the two pointers will cross one other.

        // Space Complexity : O(1)

        
        int i = 0, j = s.length() - 1;

        while(i < j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(!Character.isLetter(start) && !Character.isDigit(start)){
                i++;
                continue;
            }
            if(!Character.isLetter(end) && !Character.isDigit(end)){
                j--;
                continue;
            }

            if(Character.isLetter(start)){
                start = Character.toLowerCase(start);
            }
            if(Character.isLetter(end)){
                end = Character.toLowerCase(end);
            }
            
            if(start != end){
                return false;
            }

            i++;
            j--;
        }

        return true;



        

        // s = s.toLowerCase();
        // int i = 0, j = s.length() - 1;

        // while(i < j){
        //     if(!Character.isLetterOrDigit(s.charAt(i))){
        //         i++;
        //     }
        //     else if(!Character.isLetterOrDigit(s.charAt(j))){
        //         j--;
        //     }
        //     else{
        //         if(s.charAt(i) != s.charAt(j)){
        //             return false;
        //         }
        //         else{
        //             i++;
        //             j--;
        //         }
        //     }  
        // }

        // return true;






        

        // int i = 0, j = s.length()-1;
        // //s = s.toLowerCase();

        // while(i < j){
        //     char chI = s.charAt(i);
        //     char chJ = s.charAt(j);

        //     if(!Character.isLetterOrDigit(chI)){
        //         i++;
        //         continue;
        //     }
        //     if(!Character.isLetterOrDigit(chJ)){
        //         j--;
        //         continue;
        //     }

        //     // if(chI != chJ){
        //     //     return false;
        //     // }

        //     if(Character.isLetter(chI) && Character.isLetter(chI)){
        //         if(Character.toLowerCase(chI) != Character.toLowerCase(chJ)){
        //             return false; 
        //         }
        //     }
            
        //     else if(Character.isDigit(chI) && Character.isDigit(chI)){
        //         if(chI != chJ){
        //             return false;
        //         }
        //     }
        //     else{
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }

        // return true;






        
        
        // String ans = "";

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch >= 'A' && ch <= 'Z'){
        //         ans += Character.toLowerCase(ch);
        //     }
        //     else if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
        //         ans += ch;
        //     }
        //     else{
        //         continue;
        //     }
        // }

        // return findPalin(ans);
    }
}
