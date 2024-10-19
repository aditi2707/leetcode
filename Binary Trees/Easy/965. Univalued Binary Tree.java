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

    public boolean isSameValue(TreeNode root, int compare){

        if(root == null){
            return true;
        }

        if(root.val != compare){
            return false;
        }

        return isSameValue(root.left, compare) && isSameValue(root.right, compare);
    }

    
    public boolean isUnivalTree(TreeNode root) {

        if(root == null){
            return true;
        }

        int compare = root.val;

        return isSameValue(root, compare);





        

        // if(root == null){
        //     return true;
        // }

        // if(root.left != null && root.val != root.left.val){
        //     return false;
        // }

        // if(root.right != null && root.val != root.right.val){
        //     return false;
        // }

        // return isUnivalTree(root.left) && isUnivalTree(root.right);





        


        
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     TreeNode curr = queue.poll();

        //     if(curr.left != null){
        //         if(curr.val == curr.left.val){
        //             queue.add(curr.left);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
            
        //     if(curr.right != null){
        //         if(curr.val == curr.right.val){
        //             queue.add(curr.right);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }

        // return true;

    }
}
