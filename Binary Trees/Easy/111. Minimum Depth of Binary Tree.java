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

    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(root.left == null || root.right == null){
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));




        

        // Queue<TreeNode> queue = new LinkedList<>();
        // int level = 1;
        // if(root == null){
        //     return 0;
        // }

        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int qSize = queue.size();
        //     for(int i = 0; i < qSize; i++){
        //         TreeNode curr = queue.poll();
        //         if(curr.left == null && curr.right == null){
        //             return level;
        //         }

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //     }
        //     level++;
        // }

        // return level;





        
        
        // if(root == null){
        //     return 0;
        // }
        // if(root.left == null && root.right == null){
        //     return 1;
        // }
        // int left = minDepth(root.left);
        // int right = minDepth(root.right);

        // if(left == 0){
        //     return right + 1;
        // }
        // if(right == 0){
        //     return left + 1;
        // }

        // return Math.min(left, right) + 1;
    }
}
