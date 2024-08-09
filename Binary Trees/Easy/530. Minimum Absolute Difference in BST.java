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

    TreeNode prev;

    public void inOrder(TreeNode root, int[] min){

        if(root == null){
            return;
        }

        inOrder(root.left, min);
        if(prev != null){
            min[0] = Math.min(min[0], Math.abs(root.val - prev.val));
        }
        prev = root;
        inOrder(root.right, min);
    }
    public int getMinimumDifference(TreeNode root) {
        
        int[] min = {Integer.MAX_VALUE};
        inOrder(root, min);

        return min[0];
    }
}
