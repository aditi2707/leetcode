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

    int index;

    private TreeNode constructTree(int[] postorder, Map<Integer, Integer> map, int m, int n){

        if(m > n){
            return null;
        }

        TreeNode root = new TreeNode(postorder[index]);
        int pivot = map.get(postorder[index]);
        index--;
        root.right = constructTree(postorder, map, pivot + 1, n);
        root.left = constructTree(postorder, map, m, pivot - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        // Time Complexity : O(n)

        // Space Complexity : O(n + n)
        
        
        index = postorder.length - 1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return constructTree(postorder, map, 0, postorder.length - 1);
    }
}
