class ListNode{

    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val, ListNode prev, ListNode next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}


class MyCircularDeque {

    int k;
    int index = 0;
    ListNode head;
    ListNode tail;

    public MyCircularDeque(int k) {
        this.k = k;
    }
    
    public boolean insertFront(int value) {
        
        if(isFull()){
            return false;
        }

        if(head == null){
            head = new ListNode(value, null, null);
            tail = head;
            index++;
            return true;
        }

        ListNode temp = new ListNode(value, null, head);
        head.prev = temp;
        head = temp;
        index++;

        return true;
    }
    
    public boolean insertLast(int value) {

        if(isFull()){
            return false;
        }

        if(index == 0 || head == null || tail == null){
            head = new ListNode(value, null, null);
            tail = head;
            index++;
            return true;
        }

        ListNode temp = new ListNode(value, tail, null);
        tail.next = temp;
        tail = tail.next;
        index++;

        return true;
    }
    
    public boolean deleteFront() {
        
        if(isEmpty()){
            return false;
        }

        if(index == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }

        index--;

        return true;
    }
    
    public boolean deleteLast() {
        
        if(isEmpty()){
            return false;
        }

        if(index == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
        }

        index--;

        return true;
    }
    
    public int getFront() {
        
        if(isEmpty()){
            return -1;
        }

        return head.val;
    }
    
    public int getRear() {
        
        if(isEmpty()){
            return -1;
        }

        return tail.val;
    }
    
    public boolean isEmpty() {
        
        if(index == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        
        if(index == k){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
