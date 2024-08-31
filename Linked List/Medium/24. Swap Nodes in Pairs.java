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
    public ListNode swapPairs(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null && curr.next != null){
            
            ListNode temp = curr.next.next;
            ListNode next = curr.next;

            if(prev == null){
                next.next = curr;
                curr.next = temp;
                head = next;
            }
            else{
                prev.next = next;
                next.next = curr;
                curr.next = temp;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
