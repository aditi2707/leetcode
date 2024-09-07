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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    boolean temp = false;
    //HashMap<String, Boolean> dp = new HashMap<>();

    public boolean findSubtree(ListNode head, TreeNode root){

        if(root == null && head == null || head == null){
            return true;
        }

        if(root == null){
            return false;
        }

        //String key = "" + Objects.hash(head) + Objects.hash(root);

        // if(dp.containsKey(key)){
        //     return dp.get(key);
        // }

        if(root.val != head.val){
        //    dp.put(key, false);
            return false;
        }
        return findSubtree(head.next, root.left) || findSubtree(head.next, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        
        if(root == null && head == null){
            return true;
        }

        if(root == null || head == null){
            return false;
        }

        if(root.val == head.val){
            temp = findSubtree(head.next, root.left) || findSubtree(head.next, root.right);
        }

        if(temp){
            return true;
        }

        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
