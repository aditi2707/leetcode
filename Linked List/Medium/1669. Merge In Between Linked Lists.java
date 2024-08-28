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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int counter = 0;
        ListNode aNode = list1;
        ListNode bNode = list1;
        ListNode curr = list1;

        while(counter < b){
            counter++;
            if(counter == a){
                aNode = curr;
            }
            if(counter == b){
                bNode = curr.next;
                break;
            }

            curr = curr.next;
        }

        ListNode curr2 = list2;
        while(curr2.next != null){
            curr2 = curr2.next;
        }

        aNode.next = list2;
        curr2.next = bNode.next;

        return list1;
    }
}
