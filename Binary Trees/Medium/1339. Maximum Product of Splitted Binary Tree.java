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

    private long inorder(TreeNode root, long[] max, long sum){

        if(root == null){
            return 0;
        }

        long left = inorder(root.left, max, sum);
        long right = inorder(root.right, max, sum);

        long leftProd = (long)(left * (sum - left));
        long rightProd = (long)(right * (sum - right));

        max[0] = Math.max(max[0], Math.max(leftProd, rightProd));
        return left + right + (long)root.val;
    }

    private long sumInorder(TreeNode root){

        if(root == null){
            return 0;
        }

        long left = sumInorder(root.left);
        long right = sumInorder(root.right);

        return left + (long)root.val + right;
    }


    public int maxProduct(TreeNode root) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n * 2)
        
        
        long sum = sumInorder(root);

        long[] max = new long[1];

        inorder(root, max, sum);

        return (int)(max[0] % 1000000007);
    }
}
