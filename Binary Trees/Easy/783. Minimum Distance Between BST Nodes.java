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

    TreeNode prev = null;

    public void inorderPrev(TreeNode root, int[] min){

        if(root != null){
            inorderPrev(root.left, min);

            if(prev != null){
                min[0] = Math.min(min[0], Math.abs(root.val - prev.val));
            }

            prev = root;

            inorderPrev(root.right, min);
        }
    }

    public void inorder(TreeNode root, List<Integer> list){

        if(root != null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public int minDiffInBST(TreeNode root) {

        int[] min = {Integer.MAX_VALUE};

        inorderPrev(root, min);

        return min[0];
        
        // List<Integer> list = new ArrayList<>();
        // int min = Integer.MAX_VALUE;

        // inorder(root, list);

        // for(int i = 1; i < list.size(); i++){
        //     min = Math.min(min, list.get(i) - list.get(i-1));
        // }

        // return min;
    }
}
