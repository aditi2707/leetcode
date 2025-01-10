/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        
        int c = 0;
        Node curr = head;

        while(curr != null){
            c++;
            curr = curr.next;
        }

        int[] ans = new int[c];
        int k = 0;
        curr = head;

        while(curr != null){
            ans[k] = curr.val;
            k++;
            curr = curr.next;
        }

        return ans;
    }
}
