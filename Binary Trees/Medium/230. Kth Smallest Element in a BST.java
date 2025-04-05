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

    private void inorder(TreeNode root, int[] k, int[] ans){

        if(root == null){
            return;
        }

        inorder(root.left, k, ans);
        if(k[0] == 1){
            ans[0] = root.val;
        }
        k[0]--;
        inorder(root.right, k, ans);
    }


    private void inorder(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }


    public int kthSmallest(TreeNode root, int k) {

        // Time Complexity : O(height + k)

        // Space Complexity : O(height)


        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            k--;
            curr = stack.pop();
            
            if(k == 0){
                return curr.val;
            }

            curr = curr.right;
        }

        return 0;


        // // Time Complexity : O(n)

        // // Space Complexity : O(1)


        // int[] ans = {0};
        // int[] g = {k};

        // inorder(root, g, ans);

        // return ans[0];




        // // Time Complexity : O(n)

        // // Space Complexity : O(n * 2) (considering the stack space)

        
        // List<Integer> list = new ArrayList<>();

        // inorder(root, list);

        // return list.get(k - 1);
    }
}
