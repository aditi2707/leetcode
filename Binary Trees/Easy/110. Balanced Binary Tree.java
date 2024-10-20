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

    public int findBalance(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = findBalance(root.left);
        int right = findBalance(root.right);

        if(Math.abs(left - right) > 1 || (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE)){
            return Integer.MAX_VALUE;
        }

        return 1 + Math.max(left, right);
    }

    public int findHeight(TreeNode root, boolean[] arr){

        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int left = findHeight(root.left, arr);
        int right = findHeight(root.right, arr);

        if(left == -1 || right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
            //arr[0] = false;
        }

        return Math.max(left, right) + 1;
    }


    public int height(TreeNode root){

        if(root == null){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }
    


    public boolean isBalanced(TreeNode root) {

        if(findBalance(root) == Integer.MAX_VALUE){
            return false;
        }

        return true;



        // if(root == null){
        //     return true;
        // }

        // int left = height(root.left);
        // int right = height(root.right);

        // if(Math.abs(left - right) > 1){
        //     return false;
        // }

        // return isBalanced(root.left) && isBalanced(root.right);


        





        
        
        // boolean[] arr = {true};
        // if(findHeight(root, arr) == -1){
        //     return false;
        // }
        // return true;
        // //return arr[0];
    }
}
