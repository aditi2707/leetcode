class Solution {
    public boolean isValid(String s) {

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
                else{
                    return false;
                }
            }
            
            i++;
        }

        return stack.isEmpty();   
    }
}
