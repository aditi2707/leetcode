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

    public boolean findSum(TreeNode root, int sum, int targetSum){

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            if(root.val + sum == targetSum){
                return true;
            }
            else{
                return false;
            }
        }

        sum += root.val;
        return findSum(root.left, sum, targetSum) || findSum(root.right, sum, targetSum);
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return false;
        }

        if(targetSum - root.val == 0){
            if(root.left == null && root.right == null){
                return true;
            }
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);






        // if(root == null){
        //     return false;
        // }
        // return findSum(root, 0, targetSum);
    }
}
