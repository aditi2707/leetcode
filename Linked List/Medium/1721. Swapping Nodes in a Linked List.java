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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode firstK = null;
        ListNode lastK = null;
        ListNode first = head;
        ListNode last = head;
        int counter = 0;

        while(counter < k){
            counter++;
            if(counter == k){
                firstK = first;
                break;
            }
            first = first.next;
        }

        last = head;
        while(first.next != null){

            last = last.next;
            first = first.next;
        }

        lastK = last;
        int temp = firstK.val;
        firstK.val = lastK.val;
        lastK.val = temp;

        return head;




        
        // ListNode firstK = null;
        // ListNode lastK = null;
        // int counter = 0;
        // ListNode curr = head;

        // while(curr != null){
        //     counter++;
        //     if(counter == k){
        //         firstK = curr;
        //     }
        //     curr = curr.next;
        // }

        // int last = counter-k+1;
        // curr = head;
        // counter = 0;
        // while(curr != null){

        //     counter++;
        //     if(counter == last){
        //         lastK = curr;
        //         break;
        //     }
        //     curr = curr.next;
        // }

        // int temp = firstK.val;
        // firstK.val = lastK.val;
        // lastK.val = temp;

        // return head;
    }
}
