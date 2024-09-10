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

    public int findGCD(int a, int b){

        if(a == 1 || b == 1){
            return 1;
        }

        while(b != 0){
            int rem = a % b;
            a = b; 
            b = rem;
        }

        return a;
        
        // for(int i = Math.min(a, b); i > 1; i--){
        //     if(a % i == 0 && b % i == 0){
        //         return i;
        //     }
        // }
    
        // return 1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;

        while(prev != null){
            if(curr == null){
                break;
            }

            ListNode gcd = new ListNode(findGCD(prev.val, curr.val));
            prev.next = gcd;
            gcd.next = curr;
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
