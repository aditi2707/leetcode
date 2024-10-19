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

    int sum = 0;
  
    public void inOrder(TreeNode root, String s, int[] ans){

        if(root == null){
            return;
        }

        s += root.val;

        if(root.left == null && root.right == null){
            ans[0] += Integer.parseInt(s, 2);
        }

        inOrder(root.left, s, ans);
        inOrder(root.right, s, ans);
    }

    public void preOrder(TreeNode root, String s){
        if(root != null){
            s += String.valueOf(root.val);

            if(root.left == null && root.right == null){
                sum += Integer.parseInt(s, 2);
            }

            preOrder(root.left, s);
            preOrder(root.right, s);
        }
    }

    public int sumRootToLeaf(TreeNode root) {

          if(root == null){
            return 0;
          }
          String s = "";
          preOrder(root, s);
          return sum;


        
        // String s = "";
        // int[] ans = {0};
        // // List<String> list = new ArrayList<>();

        // inOrder(root, s, ans);

        

        // // for(String str: list){
        // //     ans += Integer.parseInt(str, 2);
        // // }

        // return ans[0];
    }
}
