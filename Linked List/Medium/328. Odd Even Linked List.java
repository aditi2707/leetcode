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
    public ListNode oddEvenList(ListNode head) {

        ListNode curr = head;

        if(head == null){
            return null;
        }
        
        ListNode temp = curr.next;
        ListNode end = temp;


        while(temp != null && temp.next != null){

            curr.next = temp.next;
            curr = curr.next;
            temp.next = curr.next;
            temp = temp.next;
        }

        curr.next = end;

        return head;





        
        // ListNode curr = head;

        // if(head == null || head.next == null || head.next.next == null){
        //     return head;
        // }
        
        // ListNode temp = curr.next;
        // ListNode tail = head;

        // while(tail.next != null){
        //     tail = tail.next;
        // }

        // ListNode end = tail;

        // while(curr != end && curr.next != end){

        //     ListNode c = temp;
        //     curr.next = temp.next;

        //     tail.next = c;
        //     tail = c;
        //     tail.next = null;

        //     curr = curr.next;
        //     temp = curr.next;

        // }

        // if(curr.next == end){
        //     curr.next = curr.next.next;
        //     tail.next = end;
        //     tail = end;
        //     tail.next = null;
        // }

        // return head;
    }
}
