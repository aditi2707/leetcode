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

    private void dfs(TreeNode left, TreeNode right, int level){

        if(left == null || right == null){
            return;
        }

        if(level % 2 == 0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        dfs(left.left, right.right, level + 1);
        dfs(left.right, right.left, level + 1);
    }

    private TreeNode bfs(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while(!queue.isEmpty()){

            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();

            while(size > 0){
                TreeNode curr = queue.poll();
                list.add(curr);

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }

                size--;
            }

            if(level % 2 == 1){
                int left = 0, right = list.size() - 1;
                while(left < right){
                    int temp = list.get(left).val;
                    list.get(left).val = list.get(right).val;
                    list.get(right).val = temp;

                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }


    public TreeNode reverseOddLevels(TreeNode root) {
        
        dfs(root.left, root.right, 0);
        return root;

        // return bfs(root);

    }
}
