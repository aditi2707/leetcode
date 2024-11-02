class ListNode{

    int[] val;
    ListNode next;

    public ListNode(int val){
        this.val = new int[]{val, val};
        next = null;
    }
}

class MinStack {

    ListNode stack;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stack == null){
            stack = new ListNode(val);
        }
        else{
            int prevMin = Math.min(stack.val[1], val);
            ListNode push = new ListNode(val);
            push.val[1] = prevMin;
            push.next = stack;
            stack = push;
        }
        return;
    }
    
    public void pop() {
        
        stack = stack.next;
        return;
    }
    
    public int top() {
        
        return stack.val[0];
    }
    
    public int getMin() {
        
        return stack.val[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
