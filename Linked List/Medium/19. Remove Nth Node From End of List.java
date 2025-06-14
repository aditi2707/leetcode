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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Time Complexity : O((total nodes - n) + n) ~ O(n)
        // If the fast node is already null, it means that the head has to be 
        // removed.

        // Space Complexity : O(1)

        
        if(head == null){
            return null;
        }
        
        ListNode fast = head;

        while(n > 0){
            fast = fast.next;
            n--;
        }

        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
        }
        else{
            slow.next = slow.next.next;
        }

        return head;



        

        // ListNode left = new ListNode(0, head);
        // head = left;
        // ListNode right = head;

        // while(n >= 0){
        //     right = right.next;
        //     n--;
        // }

        // while(right != null){
        //     left = left.next;
        //     right = right.next;
        // }

        // left.next = left.next.next;

        // return head.next;



        
        // int totalNodes = 0;

        // if(head == null){
        //     return null;
        // }

        // ListNode curr = head;

        // while(curr != null){
        //     totalNodes++;
        //     curr = curr.next;
        // }

        // if(totalNodes == n){
        //     return head.next;
        // }

        // curr = head;

        // while(curr != null){
        //     if(totalNodes == n+1){
        //         break;
        //     }
        //     totalNodes--;
        //     curr = curr.next;
        // }

        // if(curr != null && curr.next != null){
        //     curr.next = curr.next.next;
        // }

        // return head;
    }
}
