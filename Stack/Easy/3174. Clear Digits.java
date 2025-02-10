class Solution {
    public String clearDigits(String s) {

        // Time Complexity : O(2 * n)

        // Space Complexity : O(n)

        
        Stack<Character> stack = new Stack<>();
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                stack.push(ch);
            }
            else{
                // while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                //     stack.pop();
                // }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;




        // // Time Complexity : O(n)

        // // Space Complexity : O(1)


        // String ans = "";
        // int index = 0;

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(Character.isLetter(ch)){
        //         ans += ch;
        //         index = ans.length() - 1;
        //     }
        //     else{
        //         ans = ans.substring(0, index);
        //         index = ans.length() - 1;
        //     }
        // }

        // return ans;
        
    }
}
