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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode sum = null;
        ListNode currSum = null;

        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        while(curr1 != null || curr2 != null){

            if(curr1 != null && curr2 != null){
                int s = (curr1.val + curr2.val + carry) % 10;
                carry = (curr1.val + curr2.val + carry) / 10;

                if(sum == null){
                    sum = new ListNode(s);
                    currSum = sum;
                }
                else{
                    currSum.next = new ListNode(s);
                    currSum = currSum.next;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
                
            }
            else if(curr1 != null){
                int s = (curr1.val + carry) % 10;
                carry = (curr1.val + carry) / 10;

                currSum.next = new ListNode(s);
                currSum = currSum.next;

                curr1 = curr1.next;
            
            }
            else{
                int s = (curr2.val + carry) % 10;
                carry = (curr2.val + carry) / 10;

                currSum.next = new ListNode(s);
                currSum = currSum.next;
                
                curr2 = curr2.next;
            }

            
        }

        if(carry == 1){
            currSum.next = new ListNode(1);
        }
        return sum;
    }
}
