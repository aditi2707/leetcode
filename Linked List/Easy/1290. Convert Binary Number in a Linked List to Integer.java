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

    // public int binaryToDecimal(String num, int counter){

    //     int ans = 0;

    //     for(int i = counter-1; i >= 0; i--){
    //         String ch = "" + num.charAt(counter-1-i);
    //         ans += (Integer.parseInt(ch))*((int)(Math.pow(2, i)));
    //     }

    //     return ans;
    // }

    public int getDecimalValue(ListNode head) {
        
        ListNode curr = head;
        int num = 0;
        int counter = 0;

        while(curr != null){
            int data = curr.val;
            num = num * 2 + data;
            curr = curr.next;
        }

        return num;

        // while(curr != null){
        //     int data = curr.val;
        //     num = num + data;
        //     curr = curr.next;
        //     counter++;
        // }

        // int ans = binaryToDecimal(num, counter);

        // return ans;
    }
}
