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
    public ListNode sortLinkedList(ListNode head) {
        
        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.next.val < 0 && curr.next.val < curr.val){
                ListNode temp = curr.next;
                curr.next = temp.next;
                temp.next = head;
                head = temp;
            }
            else{
                curr = curr.next;
            }
        }

        return head;
    }
}
