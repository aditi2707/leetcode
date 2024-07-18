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
    public ListNode reverseList(ListNode head) {

        ListNode prev = head;

        if(head == null){
            return null;
        }
        ListNode curr = head.next;
        ListNode currN = head.next;

        while(currN != null){
            currN = currN.next;
            curr.next = prev;

            if(prev == head){
                prev.next = null;
            }

            prev = curr;
            curr = currN;
        }

        head = prev;

        return head;
        
        // Stack<Integer> stack = new Stack<>();

        // ListNode curr = head;

        // while(curr != null){
        //     stack.push(curr.val);
        //     curr = curr.next;
        // }

        // if(stack.isEmpty()){
        //     return null;
        // }

        // ListNode headN = new ListNode(stack.peek());
        // stack.pop();

        // ListNode currN = headN;

        // while(!stack.isEmpty()){
        //     currN.next = new ListNode(stack.peek());
        //     currN = currN.next;
        //     stack.pop();
        // }

        // return headN;
    }
}
