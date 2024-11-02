class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        String operations = "+-*/";

        for(String s: tokens){
            if(operations.indexOf(s) == -1){
                stack.push(Integer.valueOf(s));
            }
            else{
                int n1 = stack.pop();
                int n2 = stack.pop();

                if(s.equals("+")){
                    n1 += n2;
                }
                else if(s.equals("-")){
                    n1 = n2 - n1;
                }
                else if(s.equals("*")){
                    n1 *= n2;
                }
                else{
                    if(n1 == 0 || n2 == 0){
                        n1 = 0;
                    }
                    else{
                        n1 = n2 / n1;
                    }
                    
                }
                stack.push(n1);
            }
        }

        return stack.pop();
    }
}
