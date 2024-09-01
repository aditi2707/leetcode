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

    public void findGrandchildren(TreeNode root, int[] sum){

        if(root != null){
            if(root.val % 2 == 0){
                if(root.left != null){
                    if(root.left.left != null){
                        sum[0] += root.left.left.val;
                    }
                    if(root.left.right != null){
                        sum[0] += root.left.right.val;
                    }
                }
                if(root.right != null){
                    if(root.right.left != null){
                        sum[0] += root.right.left.val;
                    }
                    if(root.right.right != null){
                        sum[0] += root.right.right.val;
                    }
                }
            }

            findGrandchildren(root.left, sum);
            findGrandchildren(root.right, sum);
        }
    }

    public int sumEvenGrandparent(TreeNode root) {
        
        int[] sum = new int[1];

        findGrandchildren(root, sum);

        return sum[0];
    }
}
