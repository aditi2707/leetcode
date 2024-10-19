class Solution {
    public int minAddToMakeValid(String s) {

        int open = 0;
        int close = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }

        return open + close;









        
        // Stack<Character> stack = new Stack<>();

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '('){
        //         stack.push('(');
        //     }
        //     else{
        //         if(!stack.isEmpty() && stack.peek() == '('){
        //             stack.pop();
        //         }
        //         else{
        //             stack.push(')');
        //         }
        //     }
        // }

        // return stack.size();
    }
}
