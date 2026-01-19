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







// class MinStack {

//     Stack<Integer> stack;
//     Stack<int[]> min;

//     public MinStack() {
//         stack = new Stack<>();
//         min = new Stack<>();
//     }
    
//     public void push(int val) {

//         if(stack.isEmpty()){
//             min.push(new int[]{val, 1});
//         }
//         else{
//             if(val < min.peek()[0]){
//                 min.push(new int[]{val, 1});
//             }
//             else if(val == min.peek()[0]){
//                 min.peek()[1] += 1;
//             }
//         }

//         stack.push(val);

//         return;
//     }
    
//     public void pop() {

//         if(min.peek()[0] == stack.peek()){
//             min.peek()[1] -= 1;
//             if(min.peek()[1] == 0){
//                 min.pop();
//             }
//         }
//         stack.pop();

//         return;
//     }
    
//     public int top() {
        
//         return stack.peek();
//     }
    
//     public int getMin() {
        
//         return min.peek()[0];
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */









// class MinStack {

//     Stack<Integer> stack;
//     Stack<Integer> min;

//     public MinStack() {
//         stack = new Stack<>();
//         min = new Stack<>();
//     }
    
//     public void push(int val) {

//         if(stack.isEmpty()){
//             min.push(val);
//         }
//         else{
//             if(val <= min.peek()){
//                 min.push(val);
//             }
//         }

//         stack.push(val);

//         return;
//     }
    
//     public void pop() {

//         if(min.peek().equals(stack.peek())){
//             min.pop();
//         }
//         stack.pop();

//         return;
//     }
    
//     public int top() {
        
//         return stack.peek();
//     }
    
//     public int getMin() {
        
//         return min.peek();
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */








// class MinStack {

//     Stack<int[]> stack;

//     public MinStack() {
//         stack = new Stack<>();
//     }
    
//     public void push(int val) {
        
//         if(stack.isEmpty()){
//             stack.push(new int[]{val, val});
//         }
//         else{
//             int min = Math.min(stack.peek()[1], val);
//             stack.push(new int[]{val, min});
//         }

//         return;
//     }
    
//     public void pop() {
        
//         stack.pop();

//         return;
//     }
    
//     public int top() {
        
//         return stack.peek()[0];
//     }
    
//     public int getMin() {
        
//         return stack.peek()[1];
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */
