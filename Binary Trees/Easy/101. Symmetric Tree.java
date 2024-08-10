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

    public boolean symSubtree(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 != null && root2 == null){
            return false;
        }
        if(root2 != null && root1 == null){
            return false;
        }

        if(root1.val == root2.val){
            return symSubtree(root1.left, root2.right) && symSubtree(root1.right, root2.left);
        }
        else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return true;
        }

        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode currLeft = queue.poll();
            TreeNode currRight = queue.poll();

            if(currLeft == null && currRight == null){
                continue;
            }
            if(currLeft == null || currRight == null){
                return false;
            }
            if(currLeft.val != currRight.val){
                return false;
            }

            if(currLeft.val == currRight.val){
                queue.add(currLeft.left);
                queue.add(currRight.right);

                queue.add(currLeft.right);
                queue.add(currRight.left);
            }
        }

        return true;


        // if(root == null){
        //     return true;
        // }
        // return symSubtree(root.left, root.right);
    }
}
