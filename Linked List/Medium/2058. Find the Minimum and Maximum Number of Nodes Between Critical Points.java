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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        int counter = 1;
        int min = Integer.MAX_VALUE;

        while(curr.next != null){

            if((curr.val < curr.next.val && curr.val < prev.val) || (curr.val > curr.next.val && curr.val > prev.val)){
                arr.add(counter);
            }
            if(arr.size() > 1){
                min = Math.min(min, ((arr.get(arr.size()-1) - arr.get(arr.size()-2))));
            }
            counter++;
            prev = curr;
            curr = curr.next;
        }

        int[] ans = new int[2];
        if(arr.size() <= 1){
            return new int[]{-1, -1};
        }
        else{
            ans[0] = min;
            ans[1] = arr.get(arr.size()-1) - arr.get(0);
        }
        
        return ans;
    }
}
