class ListNode{
    int key;
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {

    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> map;
    int capacity;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        map = new HashMap<>();

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        
        if(!map.containsKey(key)){
            return -1;
        }

        int ans = map.get(key).val;

        ListNode curr = map.get(key);
        remove(curr);
        add(curr);

        return ans;
    }
    
    public void put(int key, int value) {
        
        if(!map.containsKey(key)){
            if(map.size() == capacity){
                ListNode node = tail.prev;
                map.remove(node.key);
                remove(node);
            }
            ListNode node = new ListNode(key, value);
            add(node);
            map.put(key, head.next);
        }
        else{
            ListNode node = map.get(key);
            node.val = value;
            map.remove(key);
            remove(node);
            add(node);
            map.put(key, head.next);
        }

        return;
    }

    public void add(ListNode node){
        ListNode headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;

        return;
    }

    public void remove(ListNode node){
        ListNode prev = node.prev;
        ListNode next = node.next;
        prev.next = next;
        next.prev = prev;

        return;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
