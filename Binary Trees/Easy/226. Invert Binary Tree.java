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
    public TreeNode invertTree(TreeNode root) {

          if(root == null){
            return null;
          }

          TreeNode temp = root.left;
          root.left = root.right;
          root.right = temp;

          invertTree(root.left);
          invertTree(root.right);

          return root;






      
        
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();

        // if(root == null){
        //     return null;
        // }
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     TreeNode curr = queue.poll();

        //     if(curr.left != null){
        //         queue.add(curr.left);
        //     }

        //     if(curr.right != null){
        //         queue.add(curr.right);
        //     }

        //     TreeNode temp = curr.left;
        //     curr.left = curr.right;
        //     curr.right = temp;
        // }

        // return root;
    }
}
