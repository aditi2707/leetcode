class ListNode{
    int key;
    ListNode next;

    public ListNode(int key){
        this.key = key;
    }
}

class MyHashSet {

    ListNode[] storage;

    public MyHashSet() {
        storage = new ListNode[3111];
    }
    
    public void add(int key) {

        int hashKey = key % 3111;

        if(storage[hashKey] == null){
            storage[hashKey] = new ListNode(key);
        }
        else{
            if(contains(key)){
                return;
            }

            ListNode curr = storage[hashKey];
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new ListNode(key);
        }

        return;
    }
    
    public void remove(int key) {

        if(!contains(key)){
            return;
        }

        int hashKey = key % 3111;
        
        ListNode curr = storage[hashKey];

        if(curr.key == key){
            storage[hashKey] = storage[hashKey].next;
            return;
        }

        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }

        return;
    }
    
    public boolean contains(int key) {
        
        int hashKey = key % 3111;

        if(storage[hashKey] == null){
            return false;
        }
        
        ListNode curr = storage[hashKey];

        while(curr != null){
            if(curr.key == key){
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
