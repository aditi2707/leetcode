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

    private void backtracking(TreeNode root, String[] ans, String temp){

        if(root == null){
            return;
        }

        temp = (char)(root.val + 97) + temp;

        if(root.left == null && root.right == null){
            if(ans[0].isEmpty() || ans[0].compareTo(temp) > 0){
                ans[0] = temp;
            }
            return;
        }

        backtracking(root.left, ans, temp);
        backtracking(root.right, ans, temp);

        // if(root.left != null){
        //     backtracking(root.left, ans, temp);
        // }
        // if(root.right != null){
        //     backtracking(root.right, ans, temp);
        // }
    }


    public String smallestFromLeaf(TreeNode root) {

        // Time Complexity : O(n * n).
        // The backtracking() will traverse every node exactly once, so TC = O(n).
        // String concatenation will take O(n) time and this will happen for every 
        // node, so that makes TC = O(n * n).

        // Space Complexity : O(n * n).
        // In the worst case when the tree is entirely skewed, then the recursion 
        // stack will have all n nodes at one time. So SC becomes O(n). At this point
        // the string will take a total space of O(n), thereby making SC = n * n.
        
        
        String[] ans = {""};

        backtracking(root, ans, "");

        return ans[0];
    }
}
