class Solution {
    public String simplifyPath(String path) {

        // Time Complexity : O(n + n)
        // Both the loops will almost cover the string.

        // Space Complexity : O(n) (ignoring the output string)
        // The stack can have almost path string if all the files are characters.

        
        Stack<String> stack = new Stack<>();
        String temp = "";
        String ans = "";

        for(int i = 0; i < path.length(); i++){
            char ch = path.charAt(i);
            if(ch == '/'){
                if(temp.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else if(!temp.equals("") && !temp.equals(".")){
                    stack.push(temp);
                }
                temp = "";
            }
            else{
                temp += ch;
            }
        }

        if(temp.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
        else if(!temp.equals("") && !temp.equals(".")){
            stack.push(temp);
        }

        if(stack.isEmpty()){
            return "/";
        }

        while(!stack.isEmpty()){
            String s = stack.pop();
            if(!s.equals("") && !s.equals(" ")){
                ans = s + "/" + ans;
            }
        }

        return "/" + ans.substring(0, ans.length() - 1);
    }
}
