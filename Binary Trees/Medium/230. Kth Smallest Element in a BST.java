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

    public void findSmallest(TreeNode root, int[] count, int[] max){

        if(root == null){
            return;
        }

        findSmallest(root.left, count, max);

        count[0]--;
        if(count[0] == 0){
            max[0] = root.val;
        }

        findSmallest(root.right, count, max);
    }

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        int n = 0;

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            n += 1;
            curr = stack.pop();

            if(n == k){
                return curr.val;
            }

            curr = curr.right;
        }

        return 0;







        
        
        // int[] max = {0};
        // int[] count = {k};
        // findSmallest(root, count, max);

        // return max[0];
    }
}
