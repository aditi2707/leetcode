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

    // public void inOrder(TreeNode root, List<Integer> prefix){

    //     if(root != null){
    //         inOrder(root.left, prefix);
    //         prefix.add(root.val);
    //         inOrder(root.right, prefix);
    //     }
    // }

    // public void sumInOrder(TreeNode root, List<Integer> prefix){

    //     if(root == null){
    //         return;
    //     }
    //     sumInOrder(root.left, prefix);
    //     root.val = prefix.get(0);
    //     prefix.remove(0);
    //     sumInOrder(root.right, prefix);
    // }

    public void sumCheck(TreeNode root, int[] arr){

        if(root != null){
            sumCheck(root.right, arr);
            arr[0] += root.val;
            root.val = arr[0];
            sumCheck(root.left, arr);
        }
    }

    public TreeNode bstToGst(TreeNode root) {

        int[] arr = new int[1];
        sumCheck(root, arr);

        return root;
        
        // List<Integer> prefix = new ArrayList<>();
        // inOrder(root, prefix);

        // for(int i = prefix.size()-2; i >= 0; i--){
        //     int t = prefix.get(i+1);
        //     t += prefix.get(i);
        //     prefix.set(i, t);
        // }

        // sumInOrder(root, prefix);

        // return root;
    }
}
