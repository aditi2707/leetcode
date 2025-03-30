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

    private ListNode mergeTwoLists(ListNode l1, ListNode l2){

        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        if(l1.val <= l2.val){
            ListNode temp = new ListNode(l1.val);
            l1 = l1.next;
            temp.next = l2;
            l2 = temp;
        }

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while(curr1 != null && curr2.next != null){
            if(curr2.val <= curr1.val){
                if(curr2.next.val < curr1.val){
                    curr2 = curr2.next;
                }
                else{
                    ListNode temp1 = curr1.next;
                    ListNode temp2 = curr2.next;
                    curr2.next = curr1;
                    curr1.next = temp2;
                    curr1 = temp1;
                    curr2 = curr2.next;
                }
            }
        }

        
        if(curr1 != null){
            curr2.next = curr1;
        }

        return l2;
    }



    // private ListNode mergeTwoLists(ListNode l1, ListNode l2){

    //     if(l1 == null && l2 == null){
    //         return null;
    //     }
    //     if(l1 == null){
    //         return l2;
    //     }
    //     if(l2 == null){
    //         return l1;
    //     }

    //     ListNode curr1 = l1;
    //     ListNode curr2 = l2;
    //     ListNode head = null;
    //     ListNode curr = null;
        
    //     if(curr1.val < curr2.val){
    //         head = new ListNode(curr1.val);
    //         curr = head;
    //         curr1 = curr1.next;
    //     }
    //     else if(curr1.val > curr2.val){
    //         head = new ListNode(curr2.val);
    //         curr = head;
    //         curr2 = curr2.next;
    //     }
    //     else{
    //         head = new ListNode(curr1.val);
    //         curr = head;
    //         curr.next = new ListNode(curr2.val);
    //         curr = curr.next;
    //         curr1 = curr1.next;
    //         curr2 = curr2.next;
    //     }

    //     while(curr1 != null && curr2 != null){
    //         if(curr1.val < curr2.val){
    //             curr.next = new ListNode(curr1.val);
    //             curr1 = curr1.next;
    //             curr = curr.next;
    //         }
    //         else if(curr1.val > curr2.val){
    //             curr.next = new ListNode(curr2.val);
    //             curr2 = curr2.next;
    //             curr = curr.next;
    //         }
    //         else{
    //             curr.next = new ListNode(curr1.val);
    //             curr = curr.next;
    //             curr.next = new ListNode(curr2.val);
    //             curr = curr.next;
    //             curr1 = curr1.next;
    //             curr2 = curr2.next;
    //         }
    //     }

    //     while(curr1 != null){
    //         curr.next = new ListNode(curr1.val);
    //         curr1 = curr1.next;
    //         curr = curr.next;
    //     }
    //     while(curr2 != null){
    //         curr.next = new ListNode(curr2.val);
    //         curr2 = curr2.next;
    //         curr = curr.next;
    //     }

    //     return head;
    // }


    public ListNode mergeKLists(ListNode[] lists) {

        // Time Complexity : O(n logk) (where k = number of linked lists).
        // TC for the merge function will be O(n) and as the number of linked lists
        // are shrinking by 2 in every traversal, the time taken will be logk.

        // Space Complexity : O(n).
        // We are using one temporary array to store the intermediate lists.


        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }

        List<ListNode> list = new ArrayList<>();

        for(ListNode l: lists){
            list.add(l);
        }

        while(list.size() > 1){
            List<ListNode> temp = new ArrayList<>();
            for(int i = 0; i < list.size(); i += 2){
                ListNode l1 = list.get(i);
                ListNode l2 = null;
                if(i + 1 < list.size()){
                    l2 = list.get(i + 1);
                }
                temp.add(mergeTwoLists(l1, l2));
            }
            list = temp;
        }

        return list.get(0);


        // Time Complexity : O(n * length_linked_list).
        // Each time the for loop runs, it is merging the intermediate list, l1 with
        // the other lists. So it will run for the entirety of the array.
        // Merging two lists will take TC of length of largest linked list.

        // Space Complexity : O(4 * length_linkedlist).
        // One is used to store l1, the other one to store l2, the third for the merged 
        // list in the function and the last for storing the merged linked list.

        // Space Complexity : O(2 * length_linkedlist) (using second mergeTwoLists()).
        // One is used to store l1, the other one to store l2, and the last for 
        // storing the merged linked list.

        
        // if(lists.length == 0){
        //     return null;
        // }
        // if(lists.length == 1){
        //     return lists[0];
        // }

        // ListNode l1 = lists[0];

        // for(int i = 1; i < lists.length; i++){
        //     ListNode l2 = lists[i];
        //     ListNode l3 = mergeTwoLists(l1, l2);
        //     l1 = l3;
        // }

        // return l1;
    }
}
