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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        //List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            //arr.add(nums[i]);
            set.add(nums[i]);
        }

        ListNode prev = head;
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr.val)){
                if(curr == head){
                    head = head.next;
                    curr = head;
                    prev = curr;
                }
                else{
                    prev.next = curr.next;
                    curr = prev.next;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}
