class Solution {
    public String makeGood(String s) {
        
        String str = "";
        Stack<Character> stack = new Stack<>();
        int top = -1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(ch);
                top++;
            }
            else{
                if(Math.abs((int)ch - (int)stack.peek()) == 32){
                    stack.pop();
                    top--;
                }
                else{
                    stack.push(ch);
                    top++;
                }
            }
        }

        while(!stack.isEmpty()){
            str = stack.pop() + str;
        }

        return str;
    }
}
