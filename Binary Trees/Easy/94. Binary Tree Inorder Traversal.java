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

    private void inorder(TreeNode root, List<Integer> ans){

        if(root == null){
            return;
        }

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);

        return;
    }


    public List<Integer> inorderTraversal(TreeNode root) {

        // Time Complexity : O(log n)(best case) and O(n)(worst case), where n is the
        // number of nodes.
        // The function will traverse every node exactly once. In the best case, the
        // tree is perfectly balanced which gives a TC of O(height) of the tree, 
        // hence O(log n). In the worst case when the tree is completely skewed, 
        // then the height becomes the total number of nodes, hence TC is O(n).

        // Space Complexity : O(n + n), where n is the number of nodes.
        // If the tree is skewed, then the recursion stack can hold all the nodes at
        // one moment. So, SC becomes O(n). An output array is used to store the 
        // result which will store all the nodes.
        
        
        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);

        return ans;
    }
}
