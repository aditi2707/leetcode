class Solution {
    public boolean isValid(String s) {

        /* 
        Edge cases:
        1. Starting with a closed bracket - returns false
        2. Only opening brackets - returns false
        3. Opening brackets != Closing brackets - returns false

        If a stack is used, then the order of opening and closing will be checked.
        And all the above conditions.
        */

        

        // Time Complexity : O(n)
        // The while loop will run for the entirety of the string if the string is
        // valid.

        // Space Complexity : O(n)
        // The stack can have a maximum of all characters, irrespective of 
        // valid/invalid.

        
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);

            if(stack.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.peek() == '(' && ch == ')'){
                    stack.pop();
                }
                else if(stack.peek() == '{' && ch == '}'){
                    stack.pop();
                }
                else if(stack.peek() == '[' && ch == ']'){
                    stack.pop();
                }
                // This is for type mismatch (closing with some other bracket)
                // Or all closing brackets
                else{
                    return false;
                }
            }
            
            i++;
        }

        return stack.isEmpty();   
    }
}
