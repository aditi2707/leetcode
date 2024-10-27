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
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = mid;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        ListNode tail = prev;
        curr = head;

        while(curr.next != null){
            ListNode temp = curr.next;
            ListNode tempTail = tail;
            tail = tail.next;
            curr.next = tempTail;
            tempTail.next = temp;
            curr = temp;
        }

        if(tail != null){
            curr.next = tail;
        }

        return;
        








        
        // int totalNodes = 0;
        // Stack<ListNode> stack = new Stack<>();

        // ListNode curr = head;

        // while(curr != null){
        //     totalNodes++;
        //     stack.push(curr);
        //     curr = curr.next;
        // }

        // curr = head;

        // int half = totalNodes % 2 == 0? totalNodes/2 : totalNodes/2 + 1;

        // while(stack.size() > half){
        //     ListNode temp = curr.next;
        //     ListNode pop = stack.pop();
        //     curr.next = pop;
        //     pop.next = temp;
        //     curr = temp;
        // }

        // curr.next = null;

        // return;
    }
}
