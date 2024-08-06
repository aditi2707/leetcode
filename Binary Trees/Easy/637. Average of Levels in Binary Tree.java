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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> average = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            double sum = 0.0;

            for(int i = 0; i < levelSize; i++){
                TreeNode curr = queue.poll();
                sum += curr.val;

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            average.add(sum/levelSize);
        }

        return average;
    }
}
