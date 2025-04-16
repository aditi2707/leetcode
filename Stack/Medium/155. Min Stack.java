class ListNode{
    int val;
    int min;
    ListNode next;

    public ListNode(int val, int min){
        this.val = val;
        this.min = min;
    }
}

class MinStack {

    ListNode stack;
    
    public MinStack() {
        stack = null;
    }
    
    public void push(int val) {

        // Time Complexity : O(1)
        // Because every operation is done at the head of the linked list.
        // As intermediate min is stored at every step, this operation is also constant.

        // Space Complexity : O(n)
        // The list will grow in number of nodes.


        if(stack == null){
            stack = new ListNode(val, val);
        }
        else{
            int min = Math.min(val, stack.min);
            ListNode temp = new ListNode(val, min);
            temp.next = stack;
            stack = temp;
        }

        return;
    }
    
    public void pop() {

        // Time Complexity : O(1)
        
        stack = stack.next;
        return;
    }
    
    public int top() {

        // Time Complexity : O(1)
        
        return stack.val;
    }
    
    public int getMin() {

        // Time Complexity : O(1)
        
        return stack.min;
    }
}






// class ListNode{

//     int[] val;
//     ListNode next;

//     public ListNode(int val){
//         this.val = new int[]{val, val};
//         next = null;
//     }
// }

// class MinStack {

//     ListNode stack;

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if(stack == null){
//             stack = new ListNode(val);
//         }
//         else{
//             int prevMin = Math.min(stack.val[1], val);
//             ListNode push = new ListNode(val);
//             push.val[1] = prevMin;
//             push.next = stack;
//             stack = push;
//         }
//         return;
//     }
    
//     public void pop() {
        
//         stack = stack.next;
//         return;
//     }
    
//     public int top() {
        
//         return stack.val[0];
//     }
    
//     public int getMin() {
        
//         return stack.val[1];
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
