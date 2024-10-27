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

    public ListNode mergeLists(ListNode head1, ListNode head2){

        if(head1 == null && head2 == null){
            return null;
        }
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        if(head1.val < head2.val){
            ListNode temp = head1;
            head1 = head1.next;
            temp.next = head2;
            head2 = temp;
        }

        ListNode curr1 = head1;
        ListNode curr2 = head2;

        while(curr1 != null && curr2.next != null){
            if(curr1.val >= curr2.val){
                if(curr1.val < curr2.next.val){
                    ListNode temp = curr1;
                    curr1 = curr1.next;
                    temp.next = curr2.next;
                    curr2.next = temp;
                }
                else{
                    curr2 = curr2.next;
                }
            }
        }

        if(curr1 != null){
            curr2.next = curr1;
        }

        return head2;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }

        List<ListNode> ll = new ArrayList<>();

        for(ListNode l: lists){
            ll.add(l);
        }

        while(ll.size() > 1){
            List<ListNode> temp = new ArrayList<>();
            for(int i = 0; i < ll.size(); i += 2){
                ListNode l1 = ll.get(i);
                ListNode l2 = null;
                if(i + 1 < ll.size()){
                    l2 = ll.get(i+1);
                }
                temp.add(mergeLists(l1, l2));
            }

            ll = temp;
        }

        return ll.get(0);






        // if(lists.length == 0){
        //     return null;
        // }

        // ListNode compare = lists[0];

        // for(int i = 1; i < lists.length; i++){
        //     compare = mergeLists(compare, lists[i]);
        // }

        // return compare;
    }
}
