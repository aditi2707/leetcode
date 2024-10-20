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

    public void postorder(TreeNode root, int[] sum){

        if(root == null){
            return;
        }

        postorder(root.left, sum);

        if(root.left != null && root.left.left == null && root.left.right == null){
            sum[0] += root.left.val;
            
        }
        postorder(root.right, sum);
    }
    

    public int findLeft(TreeNode root, boolean isLeft){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            if(isLeft){
                return root.val;
            }
            else{
                return 0;
            }
        }

        return findLeft(root.left, true) + findLeft(root.right, false);
    }

    
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

        

        // int[] sum = {0};
        // postorder(root, sum);

        // return sum[0];
        
        
        
        
        
        // if(root == null){
        //     return 0;
        // }

        // return findLeft(root, false);







        
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // int sum = 0;

        // while(!queue.isEmpty()){
        //     TreeNode curr = queue.poll();

        //     if(curr.left != null){
        //         queue.add(curr.left);
        //         if(curr.left.left == null && curr.left.right == null){
        //             sum += curr.left.val;
        //         }
        //     }
        //     if(curr.right != null){
        //         queue.add(curr.right);
        //     }
        // }

        // return sum;
    }
}
