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

    TreeNode newRoot;
    TreeNode curr;

    // public void inOrder(TreeNode root, ArrayList<TreeNode> inOrderArr){
    //     if(root != null){
    //         inOrder(root.left, inOrderArr);
    //         inOrderArr.add(root);
    //         inOrder(root.right, inOrderArr);
    //     }
    // }

    // public TreeNode modifiedTree(ArrayList<TreeNode> inOrderArr){

    //     for(int i = 0; i < inOrderArr.size(); i++){
    //         if(newRoot == null){
    //             newRoot = inOrderArr.get(i);
    //             curr = newRoot;
    //         }
    //         else{
    //             curr.right = inOrderArr.get(i);
    //             curr = curr.right;
    //         }
    //         curr.left = null;
    //     }

    //     return newRoot;
    // }

    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);

            if(curr == null){
                curr = root;
                newRoot = curr;
            }
            else{
                curr.right = root;
                curr = curr.right;
            }
            curr.left = null;

            inOrder(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {

        // ArrayList<TreeNode> inOrderArr = new ArrayList<>();
        // inOrder(root, inOrderArr);
        // return modifiedTree(inOrderArr);
        
        inOrder(root);
        return newRoot;
    }
}
