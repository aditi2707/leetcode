/* 
Set - unique keys
Think about collisions
ArrayList but what if size = 0? How to populate?
- use a fixed size array
- take odd value for the size to minimize collisions and hence searching within lists
- Tradeoff space vs collisions
*/

class ListNode {

    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

class MyHashSet {

    // Time Complexity : O(k / n) (average case)
    // Where n = array length and k is the number of values added
    // If the distribution is uniform, then each bucket will have n / k nodes
    // In other cases, the worst time will depend on the highest chain formed

    // Space Complexity : O(10001 + n + n) where n is the number of unique values


    ListNode[] buckets;

    public MyHashSet() {
        
        buckets = new ListNode[10001];
    }
    
    public void add(int key) {

        int index = key % buckets.length;

        if(buckets[index] == null){
            buckets[index] = new ListNode(key);
        }
        else{
            ListNode curr = buckets[index];

            while(curr.next != null){
                if(curr.val == key){
                    return;
                }
                curr = curr.next;
            }

            if(curr.val == key){
                return;
            }
            ListNode newNode = new ListNode(key);
            curr.next = newNode;
        }

        return;
    }
    
    public void remove(int key) {

        int index = key % buckets.length;

        if(buckets[index] == null){
            return;
        }

        ListNode curr = buckets[index];

        if(curr.val == key){
            buckets[index] = buckets[index].next;
            return;
        }

        while(curr.next != null){
            if(curr.next.val == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

        return;
    }
    
    public boolean contains(int key) {

        int index = key % buckets.length;

        if(buckets[index] == null){
            return false;
        }
        else{
            ListNode curr = buckets[index];

            while(curr != null){
                if(curr.val == key){
                    return true;
                }
                curr = curr.next;
            }
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
