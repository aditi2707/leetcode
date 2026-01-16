class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front = -1;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {

        if(stack1.isEmpty()){
            front = x;
        }
        
        stack1.push(x);

        return;
    }
    
    public int pop() {
        
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop(); 
    }
    
    public int peek() {
        
        if(stack2.isEmpty()){
            return front;
        }

        return stack2.peek();
    }
    
    public boolean empty() {
        
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */










// class MyQueue {

//     Stack<Integer> stack1;
//     Stack<Integer> stack2;
//     int peek;

//     public MyQueue() {
//         stack1 = new Stack<>();
//         stack2 = new Stack();
//         peek = 0;
//     }
    
//     public void push(int x) {

//         if(empty()){
//             peek = x;
//         }
//         stack1.push(x);
//         return;
//     }
    
//     public int pop() {
        
//         while(!stack1.isEmpty()){
//             stack2.push(stack1.pop());
//         }

//         int pop = stack2.pop();

//         if(!stack2.isEmpty()){
//             peek = stack2.peek();
//         }
        
//         while(!stack2.isEmpty()){
//             stack1.push(stack2.pop());
//         }

//         return pop;
//     }
    
//     public int peek() {
        
//         return peek;
//     }
    
//     public boolean empty() {
        
//         if(stack1.isEmpty()){
//             return true;
//         }

//         return false;
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */
