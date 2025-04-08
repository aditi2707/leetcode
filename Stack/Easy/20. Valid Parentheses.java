class Solution {
    public boolean isValid(String s) {

        // Time Complexity : O(n) because the stack operations done here are of
        // constant time.

        // Space Complexity : O(n)
        
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(stack.isEmpty() || ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(ch == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
