class Solution {
    public long evaluateExpression(String expression) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        Stack<String> stack = new Stack<>();
        int i = 0;
        
        while(i < expression.length()){
            char ch = expression.charAt(i);

            if(Character.isLetter(ch)){
                stack.push(ch + "");
                i += 3;
            }
            else if(Character.isDigit(ch) || ch == '-'){
                int j = i;
                while(j < expression.length()){
                    if(Character.isDigit(expression.charAt(j)) || 
                    expression.charAt(j) == '-'){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                stack.push(expression.substring(i, j));
                i = j;
            }
            else if(ch == '('){
                stack.push("(");
                i++;
            }
            else if(ch == ','){
                i++;
                continue;
            }
            else{
                long num1 = Long.parseLong(stack.pop());
                long num2 = Long.parseLong(stack.pop());
                stack.pop();
                String opr = stack.pop();

                if(opr.equals("a")){
                    stack.push(String.valueOf(num1 + num2));
                }
                else if(opr.equals("s")){
                    stack.push(String.valueOf(num2 - num1));
                }
                else if(opr.equals("m")){
                    stack.push(String.valueOf(num1 * num2));
                }
                else{
                    stack.push(String.valueOf(num2 / num1));
                }
                i++;
            }
        }

        return Long.parseLong(stack.pop());
    }
}
