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

    TreeNode cloneRef;

    public void inOrder(final TreeNode original, final TreeNode cloned, final TreeNode target){

        if(original != null){
            inOrder(original.left, cloned.left, target);
            if(original == target){
                cloneRef = cloned;
            }
            inOrder(original.right, cloned.right, target);
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        inOrder(original, cloned, target);
        return cloneRef;
    }
}
