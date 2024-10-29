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

    int index = 0;

    public TreeNode buildTree(int[] preorder, int m, int n, Map<Integer, Integer> map){

        if(m > n){
            return null;
        }

        int rootVal = preorder[index];
        TreeNode root = new TreeNode(rootVal);
        index++;

        root.left = buildTree(preorder, m, map.get(rootVal) - 1, map);
        root.right = buildTree(preorder, map.get(rootVal) + 1, n, map);
        
        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1, map);
    }
}
