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

        int i = 0, j = s.length()-1;
        //s = s.toLowerCase();

        while(i < j){
            char chI = s.charAt(i);
            char chJ = s.charAt(j);

            if(!Character.isLetterOrDigit(chI)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(chJ)){
                j--;
                continue;
            }

            // if(chI != chJ){
            //     return false;
            // }

            if(Character.isLetter(chI) && Character.isLetter(chI)){
                if(Character.toLowerCase(chI) != Character.toLowerCase(chJ)){
                    return false; 
                }
            }
            
            else if(Character.isDigit(chI) && Character.isDigit(chI)){
                if(chI != chJ){
                    return false;
                }
            }
            else{
                return false;
            }
            i++;
            j--;
        }

        return true;
        
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
