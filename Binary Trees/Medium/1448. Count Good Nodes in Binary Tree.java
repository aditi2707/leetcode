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
    
    public int findGoodNodes(TreeNode root, int max){
        if(root == null){
            return 0;
        }

        if(root.val >= max){
            max = Math.max(root.val, max);
            return 1 + findGoodNodes(root.left, max) + findGoodNodes(root.right, max);
        }
        return findGoodNodes(root.left, max) + findGoodNodes(root.right, max); 
    }


    public int goodNodes(TreeNode root) {
        
        return findGoodNodes(root, root.val);
    }
}
