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

    private void dfs(TreeNode root, int val){
        if(root == null){
            return;
        }

        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return;
            }
            insertIntoBST(root.left, val);
        }
        else if(val > root.val){
            if(root.right == null){
                root.right = new TreeNode(val);
                return;
            }
            insertIntoBST(root.right, val);
        }
        
        return;
        
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {

        // Time Complexity : O(height) ~ O(log n) in average case and O(n) in the
        // worst case
        // When the tree is skewed to one side, the TC will be O(n)

        // Space Complexity : O(height) ~ O(log n) in average case and O(n) in the
        // worst case
        // When the tree is skewed to one side, the SC will be O(n)

        
        if(root == null){
            return new TreeNode(val);
        }

        dfs(root, val);
        return root;
    }
}
