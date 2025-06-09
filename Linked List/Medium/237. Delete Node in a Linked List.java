/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        // Time Complexity : O(1)

        // Space Complexity : O(1)
        
        
        int val = node.next.val;
        node.val = val;
        node.next = node.next.next;

        return;
    }
}
