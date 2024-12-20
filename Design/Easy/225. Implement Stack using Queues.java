class MyStack {

    Queue<Integer> queue;
    int top;

    // Queue<Integer> queue1;
    // Queue<Integer> queue2;
    // int top;

    public MyStack() {

        queue = new LinkedList<>();
        top = 0;

        // queue1 = new LinkedList<>();
        // queue2 = new LinkedList<>();
        // top = 0;
    }
    
    public void push(int x) {

        top = x;
        queue.add(x);

        return;


        // top = x;
        // queue1.add(x);

        // return;
    }
    
    public int pop() {

        int flag = 0;
        int temp = 0;
        int size = queue.size();

        while(size > 1){
            top = queue.poll();
            queue.add(top);
            size--;
        }

        return queue.poll();



        
        // while(queue1.size() > 1){
        //     int poll = queue1.poll();
        //     queue2.add(poll);
        //     top = poll;
        // }

        // int pop = 0;
        // if(queue1.size() == 1){
        //     pop = queue1.poll();
        // }
        
        // queue1 = queue2;
        // queue2 = new LinkedList<>();

        // return pop;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {

        if(queue.isEmpty()){
            return true;
        }

        return false;



        
        // if(queue1.isEmpty()){
        //     return true;
        // }

        // return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
