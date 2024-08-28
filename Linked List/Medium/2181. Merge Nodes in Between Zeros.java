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
    public ListNode mergeNodes(ListNode head) {

        ListNode curr = head.next;

        while(curr != null){
            int sum = 0;
            ListNode temp = curr;
            
            while(temp != null && temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }

            curr.val = sum;
            if(curr.next != null){
                curr.next = temp.next;
                curr = temp.next;
            }  
            else{
                break;
            }    
        }

        return head.next;







        
        // ListNode curr = head;

        // while(curr != null){
        //     if(curr.val == 0){
        //         ListNode temp = curr.next;
        //         int sum = 0;
                
        //         while(temp != null && temp.next.val != 0){
        //             sum += temp.val;
        //             temp = temp.next;
        //         }
        //         if(temp != null){
        //             sum += temp.val;
        //             temp.val = sum;
        //             curr.next = temp;
        //             curr = temp.next;
        //         }
        //         else{
        //             break;
        //         }
 
        //     }
        // }

        // head = head.next;
        // curr = head;

        // while(curr != null && curr.next != null){
        //     if(curr.next.val == 0){
        //         ListNode temp = curr.next.next;
        //         curr.next = temp;
        //         curr = temp;
        //     }
        // }

        // return head;
    }
}
