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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

        return list1;


        

        // if(list2 == null){
        //     return list1;
        // }
        // if(list1 == null){
        //     return list2;
        // }
        // if(list1.val <= list2.val){
        //     ListNode temp = list1.next;
        //     list1.next = list2;
        //     list2 = list1;
        //     list1 = temp;
        // }

        // ListNode curr1 = list1;
        // ListNode curr2 = list2;

        // while(curr1 != null && curr2.next != null){

        //     if(curr1.val >= curr2.val){
        //         if(curr2.next.val >= curr1.val){
        //             ListNode temp1 = curr1.next;
        //             ListNode temp2 = curr2.next;
        //             curr2.next = curr1;
        //             curr1.next = temp2;
        //             curr1 = temp1;
        //         }
        //         else{
        //             curr2 = curr2.next;
        //         }
        //     }
        //     else{
        //         curr2 = curr2.next;
        //     }
        // }

        // if(curr1 != null){
        //     curr2.next = curr1;
        // }

        // return list2;
    }
}
