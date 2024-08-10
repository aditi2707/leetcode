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

    // public boolean findParent(TreeNode root, int x, int y){
    //     if(root == null){
    //         return true;
    //     }

    //     if(root.left != null && root.right != null){
    //         if(root.left.val == x && root.right.val == y){
    //             return false;
    //         }
    //         if(root.left.val == y && root.right.val == x){
    //             return false;
    //         }
    //     }

    //     return findParent(root.left, x, y) && findParent(root.right, x, y);
    // }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        int depthX = 0, depthY = 0, level = 0;
        
        if(root == null){
            return false;
        }

        // if(!findParent(root, x, y)){
        //     return false;
        // }

        queue.add(root);

        while(!queue.isEmpty()){
            int qSize = queue.size();

            for(int i = 0; i < qSize; i++){
                TreeNode curr = queue.poll();

                if(curr.left != null && curr.right != null){
                    if(curr.left.val == x && curr.right.val == y){
                        return false;
                    }
                    if(curr.left.val == y && curr.right.val == x){
                        return false;
                    }
                }

                if(curr.val == x){
                    depthX = level;
                }
                if(curr.val == y){
                    depthY = level;
                }

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }

            level++;
        }

        return depthX == depthY;
    }
}
