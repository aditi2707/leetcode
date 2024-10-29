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

    public boolean isValidTree(TreeNode root, TreeNode lower, TreeNode upper){

        if(root == null){
            return true;
        }

        if(lower != null && root.val <= lower.val || upper != null && root.val >= upper.val){
            return false;
        }

        return isValidTree(root.left, lower, root) && isValidTree(root.right, root, upper);
    }

    public void inorder(TreeNode root, List<Integer> arr){

        if(root != null){
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }

    public boolean isValidBST(TreeNode root) {

        TreeNode lower = null;
        TreeNode upper = null;

        return isValidTree(root, lower, upper);






        
        // List<Integer> arr = new ArrayList<>();
        // inorder(root, arr);

        // for(int i = 0; i < arr.size()-1; i++){
        //     if(arr.get(i) >= arr.get(i+1)){
        //         return false;
        //     }
        // }

        // return true;
    }
}
