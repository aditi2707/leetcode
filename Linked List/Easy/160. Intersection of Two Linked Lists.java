/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != currB){
            if(currA == null){
                currA = headB;
            }
            else{
                currA = currA.next;
            }

            if(currB == null){
                currB = headA;
            }
            else{
                currB = currB.next;
            }
        }

        return currA;
    



        // Stack<ListNode> stackA = new Stack<>();
        // Stack<ListNode> stackB = new Stack<>();
        // ListNode temp = null;

        // ListNode currA = headA;
        // ListNode currB = headB;

        // while(currA != null){
        //     stackA.push(currA);
        //     currA = currA.next;
        // }

        // while(currB != null){
        //     stackB.push(currB);
        //     currB = currB.next;
        // }

        // while(!stackA.isEmpty() && !stackB.isEmpty()){
        //     if(stackA.peek() == stackB.peek()){
        //         temp = stackA.pop();
        //         stackB.pop();
        //     }
        //     else{
        //         return temp;
        //     }
        // }

        // return temp;
    }
}
