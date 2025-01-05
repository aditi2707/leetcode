class ListNode{

    int key;
    int value;
    ListNode next;

    public ListNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {

    ListNode[] storage;

    public MyHashMap() {
        storage = new ListNode[3111];
    }
    
    public void put(int key, int value) {
        
        int hashKey = key % 3111;

        if(storage[hashKey] == null){
            storage[hashKey] = new ListNode(key, value);
        }
        else{
            ListNode curr = storage[hashKey];
            while(curr.next != null){
                if(curr.key == key){
                    curr.value = value;
                    break;
                }
                else{
                    curr = curr.next;
                }
            }

            if(curr.key == key){
                curr.value = value;
            }
            else{
                curr.next = new ListNode(key, value);
            }
        }

        return;
    }
    
    public int get(int key) {
        int hashKey = key % 3111;

        if(storage[hashKey] == null){
            return -1;
        }
        
        ListNode curr = storage[hashKey];
        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }
            curr = curr.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int hashKey = key % 3111;

        if(storage[hashKey] == null){
            return;
        }
        
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
            else{
                curr = curr.next;
            }
        }

        return;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
