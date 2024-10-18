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

    public void preOrder(TreeNode root, List<Integer> ans){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            return;
        }
        else if(root.left == null){
            ans.add(root.right.val);
        }
        else if(root.right == null){
            ans.add(root.left.val);
        }

        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        preOrder(root, ans);

        return ans;
    }
}
