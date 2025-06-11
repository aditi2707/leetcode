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
    public ListNode rotateRight(ListNode head, int k) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)
        

        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        int count = 0;
        ListNode curr = head;

        while(curr != null){
            count++;
            curr = curr.next;
        }

        if(k == 0 || k % count == 0){
            return head;
        }

        int rotations = k % count;
        curr = head;
        int i = count - rotations;

        while(i > 1){
            curr = curr.next;
            i--;
        }

        ListNode temp = curr.next;
        curr.next = null;
        
        ListNode rotateList = temp;
        while(rotateList.next != null){
            rotateList = rotateList.next;
        }

        rotateList.next = head;
        head = temp;

        return head;

    }
}
