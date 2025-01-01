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

    private void dfs(TreeNode root, int[] arr, int level){

        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(level <= arr[0]){
                return;
            }
            arr[0] = level;
            arr[1] = root.val;
            return;
        }

        dfs(root.left, arr, level + 1);
        dfs(root.right, arr, level + 1);

        return;
    }

    public int findBottomLeftValue(TreeNode root) {

        int[] arr = new int[2];
        arr[1] = root.val;

        dfs(root, arr, 0);

        return arr[1];

        
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // int bottomLeft = root.val;

        // while(!queue.isEmpty()){
            
        //     bottomLeft = queue.peek().val;
        //     int size = queue.size();

        //     while(size > 0){
        //         TreeNode curr = queue.poll();

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }

        //         size--;
        //     }
        // }

        // return bottomLeft;
    }
}
