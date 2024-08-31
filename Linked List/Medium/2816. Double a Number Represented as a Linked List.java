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
    public ListNode doubleIt(ListNode head) {
        
        int num = 0;
        ListNode curr = head;

        if(curr.val >= 5){
            head = new ListNode(1, head);
        }

        while(curr != null && curr.next != null){
            num = curr.next.val;
            if(num >= 5){
                curr.val = (curr.val*2)%10 + 1;
            }
            else{
                curr.val = (curr.val*2)%10;
            }
            curr = curr.next;
        }

        curr.val = (curr.val*2)%10;

        return head;
    }
}
