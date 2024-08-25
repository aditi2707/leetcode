class Solution {

    // public String starOperation(String s, int i){

    //     if(s.indexOf("*") == -1 || i >= s.length()){
    //         return s;
    //     }

    //     if(i < 0){
    //         i = 0;
    //     }

    //     if(s.charAt(i) == '*'){
    //         s = s.substring(0, i-1) + s.substring(i+1);
    //         return starOperation(s, i-1);
    //     }

    //     return starOperation(s, i+1);      
    // }

    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        String t = "";

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            t = stack.pop() + t;
        }

        return t;
        
        // return starOperation(s, 0);
    }
}
