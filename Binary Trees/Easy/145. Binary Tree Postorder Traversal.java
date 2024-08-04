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

    public void postOrder(TreeNode root, List<Integer> arr){

        if(root != null){
            postOrder(root.left, arr);
            postOrder(root.right, arr);
            arr.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);

        return ans;
    }
}
