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

    private ListNode reverse(ListNode slow){

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        slow = prev;
        return slow;
    }

    public boolean isPalindrome(ListNode head) {

        // Time Complexity : O((n / 2) * 3)

        // Space Complexity : O(1)
        

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = slow.next;
        ListNode curr = head;

        slow = reverse(slow);

        while(slow != null){
            if(curr.val != slow.val){
                return false;
            }
            curr = curr.next;
            slow = slow.next;
        }

        return true;





        // ListNode curr = head;
        // List<Integer> list = new ArrayList<>();

        // while(curr != null){
        //     list.add(curr.val);
        //     curr = curr.next;
        // }

        // for(int i = 0; i <= list.size()/2; i++){
        //     if(!list.get(i).equals(list.get(list.size() - 1 - i))){
        //         return false;
        //     }
        // }

        // return true;







        
        // Stack<Integer> stack = new Stack<>();

        // ListNode curr = head;

        // while(curr != null){
            
        //     stack.push(curr.val);
        //     curr = curr.next;
        // }

        // curr = head;
        // while(curr != null){
        //     if(curr.val == stack.peek()){
        //         stack.pop();
        //     }
        //     else{
        //         return false;
        //     }
        //     curr = curr.next;
        // }

        // return true;
    }
}
