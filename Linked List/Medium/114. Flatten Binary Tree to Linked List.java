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
    // Queue<TreeNode> queue = new LinkedList<>();

    // public void preTraversal(TreeNode root){
    //     if(root != null){
    //         queue.add(root);
    //         preTraversal(root.left);
    //         preTraversal(root.right);
    //     }
    // }
    public void flatten(TreeNode root) {

        if(root == null){
            return;
        }
        if(root.left != null){
            flatten(root.left);
        }
        if(root.right != null){
            flatten(root.right);
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode t = root;
        while(t != null){
            if(t.left == null && t.right == null){
                break;
            }
            t = t.right;
        }
        t.right = temp;

        
        // preTraversal(root);

        // while(!queue.isEmpty())
        // {   
        //     TreeNode temp = queue.poll();
        //     temp.right = queue.peek();
        //     temp.left = null;
        // }
        
    }
}
