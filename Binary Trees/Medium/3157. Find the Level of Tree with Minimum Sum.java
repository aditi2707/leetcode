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
    public int minimumLevel(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        long min = Long.MAX_VALUE;
        int minLevel = 1;
        int level = 1;

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;

            while(size > 0){
                TreeNode curr = queue.poll();
                sum += (long)curr.val;

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }

                size--;
            }

            if(sum < min){
                min = sum;
                minLevel = level;
            }
            else if(sum == min){
                minLevel = Math.min(minLevel, level);
            }

            level++;
        }

        return minLevel;
    }
}
