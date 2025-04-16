class Solution {
    public int evalRPN(String[] tokens) {

        // Time Complexity : O(n)
        // The for loop will run for the entire length of the string and all the 
        // stack operations are O(1).

        // Space Complexity : O(n)
        // The stack can have all characters of the string in some cases.
        
        
        Stack<Integer> stack = new Stack<>();

        for(String s: tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                stack.push(Integer.parseInt(s));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();

                if(s.equals("+")){
                    stack.push(a + b);
                }
                else if(s.equals("-")){
                    stack.push(b - a);
                }
                else if(s.equals("*")){
                    stack.push(a * b);
                }
                else{
                    stack.push(b / a);
                }
            }
        }

        return stack.pop();
    }
}
