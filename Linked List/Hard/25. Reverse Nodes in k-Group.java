/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverse(ListNode head, int k){

        ListNode newHead = null;
        ListNode curr = head;

        while (k > 0) {
            ListNode temp = curr.next;
            curr.next = newHead;
            newHead = curr;

            curr = temp;
            k--;
        }

        return newHead;
    }


    public ListNode reverseKGroup(ListNode head, int k) {

        // Time Complexity : O(n * 2)
        // Since each node is being processed/operated only twice; one for traversing
        // and the other for reversing.

        // Space Complexity : O(1)
        
        
        ListNode curr = head;
        ListNode newHead = null;
        ListNode kTail = null;

        while(curr != null){
            int c = 0;
            while(c < k && curr != null){
                curr = curr.next;
                c++;
            }
            if(c == k){
                ListNode r = reverse(head, k);
                if(newHead == null){
                    newHead = r;
                }
                if(kTail != null){
                    kTail.next = r;
                }
                kTail = head;
                head = curr;
            }
            
        }

        if(kTail != null){
            kTail.next = head;
        }

        if(newHead == null){
            return head;
        }

        return newHead;
    }
}
