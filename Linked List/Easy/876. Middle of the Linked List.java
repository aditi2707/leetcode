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
    public ListNode middleNode(ListNode head) {
        
        ListNode curr1 = head;
        ListNode curr2 = head;

        while(curr1.next != null && curr1.next.next != null){
            curr1 = curr1.next.next;
            curr2 = curr2.next;
        }

        if(curr1.next == null){
            return curr2;
        }

        return curr2.next;
    }
}
