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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int bottomLeft = root.val;

        while(!queue.isEmpty()){
            
            bottomLeft = queue.peek().val;
            int size = queue.size();

            while(size > 0){
                TreeNode curr = queue.poll();

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }

                size--;
            }
        }

        return bottomLeft;
    }
}
