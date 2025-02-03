class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();
        int i = 0;
        String ans = "";
        String temp = "";

        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch != ')'){
                stack.push(ch);
            }
            else{
                temp = "";
                while(stack.peek() != '('){
                    temp += stack.pop();
                }
                stack.pop();
                int j = 0;
                while(j < temp.length()){
                    stack.push(temp.charAt(j));
                    j++;
                }
            }

            i++;
        }

        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;
    }
}
