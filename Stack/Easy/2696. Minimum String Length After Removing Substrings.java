class Solution {
    public int minLength(String s) {
        
        Stack<Character> stack = new Stack<>();
        int top = -1;
        int index = 0;

        while(index < s.length()){
            char ch = s.charAt(index);
            
            if(stack.isEmpty() || (ch != 'B' && ch != 'D')){
                stack.push(ch);
                top++;
            }
            else{
                if((ch == 'B' && stack.peek() == 'A') || (ch == 'D' && stack.peek() == 'C')){
                    stack.pop();
                    top--;
                }
                else{
                    stack.push(ch);
                    top++;
                }
            }
            index++;
        }

        return top+1;
    }
}
