class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack = new Stack<>();
        int push = 0, pop = 0;

        while(push < pushed.length && pop < popped.length){
            if(pushed[push] != popped[pop]){
                if(!stack.isEmpty() && popped[pop] == stack.peek()){
                    pop++;
                    stack.pop();
                }
                else{
                    stack.push(pushed[push]);
                    push++;
                }   
            }
            else{
                pop++;
                push++;
            }
        }

        while(!stack.isEmpty() && pop < popped.length){
            if(popped[pop] == stack.pop()){
                pop++;
            }
            else{
                return false;
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}
