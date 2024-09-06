class Solution {
    public int scoreOfParentheses(String s) {
        
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(0);
            }
            else{
                int k = stack.pop();
                int j = stack.pop();

                stack.push(j + Math.max(2*k, 1));
            }
        }
        
        return stack.pop();
    }
}
