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

    int[] ans = new int[1];

    private void sumRootToLeaf(TreeNode root, int sum){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            sum = sum * 10 + root.val;
            ans[0] += sum;
            return;
        }

        sum = sum * 10 + root.val;
        sumRootToLeaf(root.left, sum);
        sumRootToLeaf(root.right, sum);
    }


    public int sumNumbers(TreeNode root) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        if(root == null){
            return 0;
        }

        sumRootToLeaf(root, 0);

        return ans[0];
    }
}
