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
        
        // Time Complexity : O(n / 2)

        // Space Complexity : O(1)

        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null){
            return slow;
        }

        return slow.next;





        // // Time Complexity : O(n + (n / 2))

        // // Space Complexity : O(1)


        // int count = 0;
        // ListNode curr = head;

        // while(curr != null){
        //     count++;
        //     curr = curr.next;
        // }

        // int half = (count / 2) + 1;
        // curr = head;

        // while(half > 1){
        //     curr = curr.next;
        //     half--;
        // }

        // return curr;
        
    }
}
