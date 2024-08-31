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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int size = 0;
        ListNode curr = head;
        ListNode[] ans = new ListNode[k];

        while(curr != null){
            size++;
            curr = curr.next;
        }

        int partSize = size/k;
        int extra = size%k;
        int counter = 1;
        curr = head;

        while(counter <= k && curr != null){
            ListNode temp = curr;
            int p = 1;
            if(counter <= extra){
                while(p < partSize+1){
                    temp = temp.next;
                    p++;
                }
            }
            else{
                while(p < partSize){
                    temp = temp.next;
                    p++;
                }
            }
            ans[counter-1] = curr;
            curr = temp.next;
            temp.next = null;
            counter++;
        }

        return ans;
    }
}
