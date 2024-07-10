class Solution {
    public int minOperations(String[] logs) {
        
        Stack<String> stack = new Stack<>();
        int top = -1;

        for(int i = 0; i < logs.length; i++){
            String folder = logs[i];

            if(!stack.isEmpty() && folder.compareTo("../") == 0){
                stack.pop();
                top--;
            }

            else if(folder.compareTo("./") == 0 || (stack.isEmpty() && folder.compareTo("../") == 0)){
                continue;
            }
            else{
                stack.push(folder);
                top++;
            }
        }

        return top+1;
    }
}
