/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        // Time Complexity : O(h) (O(log n) in average case and O(n) in worst case)

        // Space Complexity : O(1)
        // We are removing the older calls

        
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(curr);

        while(!stack.isEmpty()){
            if(p.val == stack.peek().val || q.val == stack.peek().val){
                return stack.peek();
            }
            if((p.val < stack.peek().val && q.val > stack.peek().val) || (q.val < stack.peek().val && p.val > stack.peek().val)){
                return stack.peek();
            }
            if(p.val < stack.peek().val && q.val < stack.peek().val){
                stack.pop();
                stack.push(curr.left);
                curr = curr.left;
            }
            else{
                stack.pop();
                stack.push(curr.right);
                curr = curr.right;
            }
        }

        return null;






        

        // // Time Complexity : O(log n) (because it will go only in one subtree)

        // // Space Complexity : O(log n)


        // if(root == null){
        //     return null;
        // }

        // if(p.val < root.val && q.val < root.val){
        //     return lowestCommonAncestor(root.left, p, q);
        // }
        // if(p.val > root.val && q.val > root.val){
        //     return lowestCommonAncestor(root.right, p, q);
        // }

        // return root;


        

        

        
        // if(root == null){
        //     return null;
        // }

        // if(root.val == p.val || root.val == q.val){
        //     return root;
        // }
        // if(root.left != null && root.left.val == p.val && 
        // root.right != null && root.right.val == q.val){
        //     return root;
        // }
        // if(root.left != null && root.left.val == q.val && 
        // root.right != null && root.right.val == p.val){
        //     return root;
        // }

        // if(p.val < root.val && q.val < root.val){
        //     return lowestCommonAncestor(root.left, p, q);
        // }
        // if(p.val > root.val && q.val > root.val){
        //     return lowestCommonAncestor(root.right, p, q);
        // }

        // return root;
        
    }
}
