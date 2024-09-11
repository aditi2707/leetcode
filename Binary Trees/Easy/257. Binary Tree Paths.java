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

    public void findTreePath(TreeNode root, String s, List<String> ans){

        if(root != null){
            s += Integer.toString(root.val);
            if(root.left == null && root.right == null){
                ans.add(s);
            }
            else{
                s += "->";
                findTreePath(root.left, s, ans);
                findTreePath(root.right, s, ans);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<>();
        findTreePath(root, "", ans);

        return ans;
    }
}
