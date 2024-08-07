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

    public int postOrder(TreeNode root, int[] sum){

        if(root == null){
            return 0;
        }
        int left = postOrder(root.left, sum);
        int right = postOrder(root.right, sum);
        
        sum[0] += Math.abs(left - right);
        return root.val + left + right;
    }
    
    public int findTilt(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        int[] sum = new int[1];
        postOrder(root, sum);

        return sum[0];
    }
}
