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

    public int maxNum(int[] arr, int m, int n){

        int max = Integer.MIN_VALUE, j = 0;
        for(int i = m; i <= n; i++){
            if(arr[i] > max){
                max = arr[i];
                j = i;
            }
        }
        
        return j;
    }

    public TreeNode maxBinaryTree(int[] nums, int m, int n){

        if(m > n){
            return null;
        }
        int rootVal = maxNum(nums, m, n);

        TreeNode root = new TreeNode(nums[rootVal]);
        root.left = maxBinaryTree(nums, m, rootVal-1);
        root.right = maxBinaryTree(nums, rootVal+1, n);

        return root;
    }
    

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode root = maxBinaryTree(nums, 0, nums.length-1);
        return root;
        
    }
}
