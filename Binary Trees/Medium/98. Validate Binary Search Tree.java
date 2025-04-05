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

    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max){

        if(root == null){
            return true;
        }

        if(min != null && root.val <= min.val || 
        max != null && root.val >= max.val){
            return false;
        }

        return isValidBST(root.left, min, root) && 
        isValidBST(root.right, root, max);

    }


    private boolean isValidBST(TreeNode root, long min, long max){

        if(root == null){
            return true;
        }

        if(root.val <= (long)min || root.val >= (long)max){
            return false;
        }

        return isValidBST(root.left, min, root.val) && 
        isValidBST(root.right, root.val, max);

    }


    private void inorder(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

        return;
    }


    public boolean isValidBST(TreeNode root) {

        // // Time Complexity : O(n)

        // // Space Complexity : O(n) (considering the recursion stack space)


        TreeNode min = null;
        TreeNode max = null;

        return isValidBST(root, min, max);



        // // Time Complexity : O(n)

        // // Space Complexity : O(n) (considering the recursion stack space)


        // long min = Long.MIN_VALUE;
        // long max = Long.MAX_VALUE;

        // return isValidBST(root, min, max);




        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2) (considering the recursion stack space)

        
        // List<Integer> list = new ArrayList<>();

        // inorder(root, list);

        // for(int i = 1; i < list.size(); i++){
        //     if(list.get(i) <= list.get(i - 1)){
        //         return false;
        //     }
        // }

        // return true;
    }
}
