/* 
Map - values are overwritten if key already present
Think about collisions
ArrayList but what if size = 0? How to populate?
- use a fixed size array
- take odd value for the size to minimize collisions and hence searching within lists
- Tradeoff space vs collisions
*/

class ListNode {

    int key;
    int val;
    ListNode next;

    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {

    // Time Complexity : O(k / n) (average case)
    // Where n = array length and k is the number of values added
    // If the distribution is uniform, then each bucket will have n / k nodes
    // In other cases, the worst time will depend on the highest chain formed

    // Space Complexity : O(10001 + n + n) where n is the number of unique values


    ListNode[] buckets;

    public MyHashMap() {
        
        buckets = new ListNode[10001];
    }
    
    public void put(int key, int value) {
        
        int index = key % buckets.length;

        if(buckets[index] == null){
            ListNode node = new ListNode(key, value);
            buckets[index] = node;
            return;
        }
        else{
            ListNode curr = buckets[index];

            while(curr.next != null){
                if(curr.key == key){
                    curr.val = value;
                    return;
                }
                curr = curr.next;
            }

            if(curr.key == key){
                curr.val = value;
                return;
            }

            curr.next = new ListNode(key, value);

            return;
        }
    }
    
    public int get(int key) {
        
        int index = key % buckets.length;

        if(buckets[index] == null){
            return -1;
        }
        else{
            ListNode curr = buckets[index];

            while(curr != null){
                if(curr.key == key){
                    return curr.val;
                }
                curr = curr.next;
            }

            return -1;
        }
    }
    
    public void remove(int key) {
        
        int index = key % buckets.length;

        if(buckets[index] == null){
            return;
        }
        else{
            ListNode curr = buckets[index];

            if(curr.key == key){
                buckets[index] = buckets[index].next;
                return;
            }

            while(curr.next != null){
                if(curr.next.key == key){
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }

            return;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
