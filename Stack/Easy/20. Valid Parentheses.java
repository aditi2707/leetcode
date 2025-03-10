class Solution {
    public boolean isValid(String s) {

        // Time Complexity : O(n) because the stack operations done here are of
        // constant time.

        // Space Complexity : O(n)
        
        
        Stack<Character> stack = new Stack<>();
        int i = 1;

        stack.push(s.charAt(0));

        while(i < s.length()){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char peek = stack.peek();
                    if(ch == ')' && peek == '('){
                        stack.pop();
                    }
                    else if(ch == ']' && peek == '['){
                        stack.pop();
                    }
                    else if(ch == '}' && peek == '{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
        }

        return stack.isEmpty();
    }
}
